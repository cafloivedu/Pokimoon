/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author win8
 */
public class Ventana extends JFrame{
    public Thread movieLoop;
    public Canvas c;
    public Link J1;
    public ImageIcon fondo;
    
    public Ventana(int w, int h){
        try{
        c= new Canvas();
        this.setSize(w, h);
        c.setSize(w, h);
        this.add(c);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                switch(ke.getKeyCode()){
                    case KeyEvent.VK_UP:{
                    J1.currentDirection=Link.UP;
                    break;
                    }
                    case KeyEvent.VK_LEFT:{
                    J1.currentDirection=Link.LEFT;
                    break;
                    }
                    case KeyEvent.VK_RIGHT:{
                    J1.currentDirection=Link.RIGHT;
                    break;
                    }
                    case KeyEvent.VK_DOWN:{
                    J1.currentDirection=Link.DOWN;
                    break;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                switch(ke.getKeyCode()){
                    case KeyEvent.VK_UP:{
                    J1.currentDirection=Link.NONE;
                    Random random = new Random();
                    int number = 0;
                    for(int counter=1; counter<=1;counter++){
                    number = 1+random.nextInt(5);
                    
                    }
                        if (number==2) {
                           Pokemones.pokemon(); 
                        } 
                    break;
                    }
                    case KeyEvent.VK_LEFT:{
                    J1.currentDirection=Link.NONE;
                    Random random = new Random();
                    int number = 0;
                    for(int counter=1; counter<=1;counter++){
                    number = 1+random.nextInt(5);
                    
                    }
                        if (number==2) {
                           Pokemones.pokemon(); 
                        }  
                        break;
                    }
                    case KeyEvent.VK_RIGHT:{
                    J1.currentDirection=Link.NONE;
                    Random random = new Random();
                    int number = 0;
                    for(int counter=1; counter<=1;counter++){
                    number = 1+random.nextInt(5);
                    
                    }
                        if (number==2) {
                           Pokemones.pokemon(); 
                        }
                    break;
                    }
                    case KeyEvent.VK_DOWN:{
                    J1.currentDirection=Link.NONE;
                    Random random = new Random();
                    int number = 0;
                    for(int counter=1; counter<=1;counter++){
                    number = 1+random.nextInt(5);
                    
                    }
                        if (number==2) {
                           Pokemones.pokemon(); 
                        }
                    break;
                    }
                }
            }
        });
        J1 = new Link(100, 100, 5, 5, "Zelda");
        String []names={"UP","RIGHT","DOWN","LEFT"};
        J1.loadPics(names);
        
        movieLoop = new Thread(new Runnable() {
            @Override
            public void run() {
                c.createBufferStrategy(2);
                Graphics g= c.getBufferStrategy().getDrawGraphics();
                long startTime=System.currentTimeMillis();
                long currentTime=0;
                while (true) {                    
                    try {
                        
                        currentTime = System.currentTimeMillis()- startTime;
                        fondo = new ImageIcon(getClass().getResource("/Fondo/x.png"));
                        
                        g.setColor(Color.BLACK);
                        g.drawImage (fondo.getImage(), 0, 0, 1366, 768, null);
//                        g.fillRect(0, 0, getWidth(), c.getHeight());
                        switch(J1.currentDirection){
                    case Link.UP:{
                    J1.moveUp(currentTime);
                    break;
                    }
                    case Link.LEFT:{
                    J1.moveLeft(currentTime);
                    break;
                    }
                    case Link.RIGHT:{
                    J1.moveRight(currentTime);
                    break;
                    }
                    case Link.DOWN:{
                    J1.moveDown(currentTime);
                    break;
                    }
                }
                        J1.draw(g);
                        c.getBufferStrategy().show();
                        Thread.sleep(20);
                    } catch (Exception e) {
                        
                    }
                }
            }
        });
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Ventana v= new Ventana(650,650);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
        v.movieLoop.start();
    }
            
}
