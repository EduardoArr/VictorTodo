/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author eduar
 */
public class Ejemplo1 {
    public static void main(String[] args) throws IOException {
     Process p = new ProcessBuilder("CMD", "/C", "DIR").start();
    
     
     try{
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
     
    }
    
}
