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
public class SolicitaSuspender {
    private boolean suspender;
    
    public synchronized void set(boolean b) {
        suspender = b;
        notifyAll();
    }
    
    public synchronized void esperandoParaRenaudar() throws InterruptedException{
        while(suspender){
            wait();
        }
    }
}
