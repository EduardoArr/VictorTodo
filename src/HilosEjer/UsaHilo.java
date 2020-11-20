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
public class UsaHilo {
    public static void main(String[] args) {
        HiloSimple h = new HiloSimple();
        Thread t = new Thread(h);
        t.start();
        for(int i = 0; i<5; i++){
            System.out.println("Fuera del hilo");
            
        }
    }
}
