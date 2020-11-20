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
public class MyHilo extends Thread{
    int contador = 0;
    private SolicitaSuspender suspender = new SolicitaSuspender();
    public void Suspender(){
        suspender.set(true);
    }
    public void Renaudar(){
        suspender.set(false);
    }
    @Override
    public void run(){
       while(true){
           try {
               contador++;        
               sleep(1000);
               suspender.esperandoParaRenaudar();
           } catch (InterruptedException ex) {
               Logger.getLogger(MyHilo.class.getName()).log(Level.SEVERE, null, ex);
           }
      
       }
    }

    public int getContador() {
        return contador;
    }
    
   
}
