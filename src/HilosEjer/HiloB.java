/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosEjer;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class HiloB extends Thread{
     private Contador contador;
    public HiloB(String n, Contador c){
        setName(n);
        contador = c;
        
    }
    
    @Override
    public void run(){
        synchronized (contador){
        for(int i = 0; i<300; i++){
            contador.decrementa();
            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(getName() + " contador vale " + contador.valor());
        }
    }
}
