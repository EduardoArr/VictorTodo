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
public class HiloEjemplo2 extends Thread{
    public void run(){
        System.out.println(
            "Dentro del Hilo: " + Thread.currentThread().getName() +
            "\n\tPrioridad: " + Thread.currentThread().getPriority()+
            "\n\tID: " + Thread.currentThread().getId() +
            "\n\tHilos activos: " + Thread.currentThread().activeCount());
    }
    
    public static void main(String[] args) {
        Thread.currentThread().setName("Principal");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().toString());
        
        
        HiloEjemplo2 h;
        
        for(int i = 0; i<3; i++){
            h = new HiloEjemplo2();
            h.setName("Hilo " + i);
            h.setPriority(i+1);
            h.start();
            System.out.println("Informacion del " + h.getName() + ": " + h.toString());
            
           
        }
        System.out.println("3 Hilos Creados... ");
        System.out.println("Hilos activos: " + Thread.activeCount());
    }
}
