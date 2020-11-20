/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eduar
 */
public class Ej7 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (in);
        String cadena = "";
        
        while(!"*".equals(cadena)){
            System.out.println("Cadena (* para salir): ");
            cadena = br.readLine();
            
        }
            
        
    }
}
