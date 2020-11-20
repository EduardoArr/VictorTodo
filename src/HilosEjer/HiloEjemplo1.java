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
public class HiloEjemplo1 extends Thread{
    
    public HiloEjemplo1(String nombre){
        setName(nombre);
        System.out.println("Creando Hilo: " + getName());
        
    }   

    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Hilo: " + getName() + " C = " + i);
        }
    }
    
    public static void main(String[] args) {
        HiloEjemplo1 h1 = new HiloEjemplo1("Hilo 1");
        HiloEjemplo1 h2 = new HiloEjemplo1("Hilo 2");
        HiloEjemplo1 h3 = new HiloEjemplo1("Hilo 3");
        
        h1.start();
        h2.start();
        h3.start();
        
        System.out.println("3 hilo iniciados...");
    }
}
