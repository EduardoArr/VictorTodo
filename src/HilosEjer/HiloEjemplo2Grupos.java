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
public class HiloEjemplo2Grupos extends Thread{
    public void run(){
        System.out.println("Informacion del Hilo: " + Thread.currentThread().toString());
        for(int i = 0; i<1000; i++) {
        i++;
        System.out.println(Thread.currentThread().getName() + "FINALIZANDO EJECUCIÓN");
        
            
        }
        
        
    }
    
    public static void main(String[] args) {
        Thread.currentThread().setName("Principal");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().toString());
        
        
        ThreadGroup grupo = new ThreadGroup("Grupo de Hilos");
        HiloEjemplo2Grupos h = new HiloEjemplo2Grupos();
        
        Thread h1 = new Thread(grupo, h, "Hilo 1");
        Thread h2 = new Thread(grupo, h, "Hilo 2");    
        Thread h3 = new Thread(grupo, h, "Hilo 3");
        
        h1.start();
        h2.start();
        h3.start();
        
        System.out.println("3 HILOS CREADOS");
        System.out.println("Hilos Activos: " + Thread.activeCount());
        
    }
}
