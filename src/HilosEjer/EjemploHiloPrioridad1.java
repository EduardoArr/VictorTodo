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
public class EjemploHiloPrioridad1 {
    public static void main(String[] args) throws InterruptedException {
        HiloPrioridad1 h1 = new HiloPrioridad1("Hilo1");
        HiloPrioridad1 h2 = new HiloPrioridad1("Hilo2");
        HiloPrioridad1 h3 = new HiloPrioridad1("Hilo3");
        
        h1.setPriority(Thread.NORM_PRIORITY);
        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY);
        
        h1.start();
        h2.start();
        h3.start();
        
        Thread.sleep(1000);
        
        h1.pararHilo();
        h2.pararHilo();
        h3.pararHilo();
        
        System.out.println("h2 (Prioridad Maxima): " + h2.getContador());
        System.out.println("h1 (Prioridad Media): " + h1.getContador());
        System.out.println("h3 (Prioridad Minima): " + h3.getContador());
    }
}
