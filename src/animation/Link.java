
package animation;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author win8
 */
public class Link {
    public static final int UP=2;
    public static final int RIGHT=3;
    public static final int LEFT=1;
    public static final int DOWN=0;
    public static final int NONE=-1;
    Animation [] animations;
    int x;
    int y;
    int vx;
    int vy;
    int currentAnimation;
    int currentDirection;
    String path;
    public Link(int x, int y, int vx, int vy, String path){
        this.path=path;
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
        this.currentDirection=-1;
        animations = new Animation[4];
    }
    public void loadPics(String [] names) throws Exception{
        for (int j = 0; j < 4; j++) {
            String name = names[j];
            animations[j]=new Animation();
            for (int i = 1; i <= 5; i++) {
                animations[j].addScene(new ImageIcon(getClass().getResource(path+"//"+name+i+".png")).getImage(), 100);
            }
        }
    }
    public void moveUp(long time){
    if(y>0-vy){
    y-=vy;
    currentAnimation = Link.DOWN;
    animations[Link.DOWN].update(time);
    }
    }
    public void moveDown(long time){
    if(y<565-vy){
    y+=vy;
    currentAnimation = Link.UP;
    animations[Link.UP].update(time);
    }
    }
    public void moveRight(long time){
    if(x<600-vx){
    x+=vx;
    currentAnimation = Link.LEFT;
    animations[Link.LEFT].update(time);
    }
    }
    public void moveLeft(long time){
    if(x>0-vx){
    x-=vx;
    currentAnimation = Link.RIGHT;
    animations[Link.RIGHT].update(time);
    }
    }
    public void draw(Graphics g){
    g.drawImage(animations[currentAnimation].getImage(), x, y, null);
}
}
