package PruebaCadena;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class PruebaCadena {
      public static void main (String [] args)
 {
   InputStreamReader in = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader (in);
   String texto;
   try {
    System.out.println("Introduce una cadena....");
    texto= br.readLine();
    System.out.println("Cadena escrita: "+texto); 
    in.close();	 
   }catch (Exception e) { e.printStackTrace();}	
 }
}
