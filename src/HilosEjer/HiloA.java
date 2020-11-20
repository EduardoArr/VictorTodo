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
public class HiloA extends Thread{
    private Contador contador;
    public HiloA(String n, Contador c){
        setName(n);
        contador = c;
        
    }
    
    @Override
    public void run(){
        synchronized (contador){
        for(int i = 0; i<300; i++){
            contador.incrementa();
            try {
                sleep(1);
            } catch (Exception ex) {
         }  

        }
            System.out.println(getName() + " contador vale " + contador.valor());

        }
    }
}
