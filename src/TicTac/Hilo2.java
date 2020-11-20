/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTac;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class Hilo2 extends Thread{
    public void run(){
       while (true){
           System.out.println("TAC");
           try {
               sleep(1);
           } catch (InterruptedException ex) {
               Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
}
