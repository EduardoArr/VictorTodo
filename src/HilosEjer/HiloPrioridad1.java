/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosEjer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class HiloPrioridad1 extends Thread{
    private int c = 0;
    private boolean stopHilo = false;
    
    public HiloPrioridad1(String nombre){
        super(nombre);
    }
    
    public int getContador(){
        return c;
        
    }
    
    public void pararHilo(){
        stopHilo = true;
    }
    
    public void run(){
        while(!stopHilo){
            try{
                Thread.sleep(2);
            } catch (Exception ex) {  }
            c++;
        }
        System.out.println("Fin Hilo: " + this.getName());
    }
    
}
