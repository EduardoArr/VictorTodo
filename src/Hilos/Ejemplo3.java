/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author eduar
 */
public class Ejemplo3 {
    public static void main(String[] args) throws IOException {
        File directorio = new File("D:\\netbeans proyectos\\Victo\\src");
        ProcessBuilder pb = new ProcessBuilder("java", "Espera.java");
        pb.directory(directorio);
        
        //System.out.printf("Directorio de trabajo: %s%n", pb.directory());
        
        Process p = pb.start();
        
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
