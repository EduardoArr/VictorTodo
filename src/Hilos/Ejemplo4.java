/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author eduar
 */
public class Ejemplo4 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DATE");
        //pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        Process p = pb.start();
       // File fOut = new File("salida.txt");
        //File fErr = new File("error.txt");
        
        OutputStream os = p.getOutputStream();//escribir en el stream de entrada
        os.write("15-06-18".getBytes()); //codificar la cadena
        os.flush(); //vaciar buffer
        
        //pb.redirectOutput(fOut);
        //pb.redirectError(fErr);
        //pb.start();
        
       InputStream is = p.getInputStream();
        int c;
        
        while((c = is.read()) != -1)
                System.out.print((char) c);
        is.close();
        
        
        int exitVal;
        try{
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
  
}
