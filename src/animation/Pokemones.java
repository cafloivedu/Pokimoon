/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

/**
 *
 * @author Iván Eduardo Cadena
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Pokemones{
    
    
    public static int generador(){
        Random random = new Random();
        int number = 0;
        for(int counter=1; counter<=1;counter++){
        number = 1+random.nextInt(10);
        System.out.println(number);
        }
        return number;
    }
    
    public static void pokemon(){/*/String pokemon/*/
    //String []pokemones={"Pikachu","Charmander","Squirtle","Rattata","Raichu","Jigglypuff","Pichu","MewTwo","Psyduck","Meowth"};
    int n = generador();
    /*/int Pikachu = 1;
    int Charmander = 2;
    int Squirtle = 3;
    int Rattata = 4;
    int Raichu = 5;
    int Jigglypuff = 6;
    int Pichu = 7;
    int MewTwo = 8;
    int Psyduck = 9;
    int Meowth = 10;/*/
        if (n == 1) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Pikachu");
        }
        if (n == 2) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Charmander");
        }
        if (n == 3) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Squirtle");
        }
        if (n == 4) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Rattata");
        }
        if (n == 5) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Raichu");
        }
        if (n == 6) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Jigglypuff");
        }
        if (n == 7) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Pichu");
        }
        if (n == 8) {
            JOptionPane.showMessageDialog(null, "Has encontrado un MewTwo");
        }
        if (n == 9) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Psyduck");
        }
        if (n == 10) {
            JOptionPane.showMessageDialog(null, "Has encontrado un Meowth");
        }
    
    }
    
}