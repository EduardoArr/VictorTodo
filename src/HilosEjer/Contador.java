/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosEjer;

/**
 *
 * @author eduar
 */
public class Contador {
    private int c = 0;
    
    Contador(int c){
     this.c = c;
    }
    
    public void incrementa(){
        c = c+1;
    }
    
    public void decrementa(){
        c = c-1;
    }
    
    public int valor(){
        return c;
    }
 
}
