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
public class CompartirInf1 {
    public static void main(String[] args) {
        Contador cont = new Contador(100);
        HiloA ha = new HiloA("HiloA", cont);
        HiloB hb = new HiloB("HiloB", cont);
        
        ha.start();
        hb.start();
    }
}
