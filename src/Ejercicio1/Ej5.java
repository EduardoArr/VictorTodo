/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Ej5 {
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una cadena: ");
        String cadena = s.nextLine();
        if(args.length > 0){
            System.out.println("Hay demasiados parametros");
        
        }else{
            for(int i = 0; i<5; i++){
                System.out.println(cadena);
            }
        }
      
    }
    
}
