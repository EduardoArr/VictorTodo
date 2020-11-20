/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosEjer;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class MainSuspende {
    public static void main(String[] args) {
        MyHilo m = new MyHilo();
        Scanner s = new Scanner(System.in);
        String cadena="";
        m.start();
        while(!"*".equals(cadena)){
            System.out.println("Cadena: ");
            
            cadena = s.nextLine();
           
            if("S".equals(cadena)){
                m.Suspender();
            }
            if("R".equals(cadena)){
                m.Renaudar();
            }
            
        }
        
        System.out.println(m.getContador());
       
        
    }
}
