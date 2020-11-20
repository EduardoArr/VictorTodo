/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author eduar
 */
public class Ejemplo1_6 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (in);
        BufferedReader br2 = new BufferedReader (in);
        int num1;
        int num2;
        int resul;
        String texto1;
        String texto2;
        
        try{
            System.out.println("Dime un numero: ");
            texto1 = br.readLine();
            System.out.println("Otro numero: ");
            texto2 = br2.readLine();
            num1 = Integer.parseInt(texto1);
            num2 = Integer.parseInt(texto2);
            resul = num1 + num2;
           System.out.println("El resultado es: " + resul);
            in.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
