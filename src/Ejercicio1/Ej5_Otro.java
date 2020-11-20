/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author eduar
 */
public class Ej5_Otro {
     public static void main(String[] args) throws IOException{
        //File directorio = new File("D:\\netbeans proyectos\\Victo\\src\\Ejercicio1");
        //ProcessBuilder pb = new ProcessBuilder("java", "Ej5.java");
        ProcessBuilder pb = new ProcessBuilder("java", "Espera");
        //pb.directory(directorio);
        
        //Process p = pb.start();
        /*
        OutputStream os = p.getOutputStream();
        os.write("Hola Manu\n".getBytes());
        os.flush();
        */
        
        File archivo = new File("salida.txt");
        File fout = new File("datos.txt");
        File ferror = new File("error.txt");
        
        
        
        pb.redirectOutput(archivo);
        pb.redirectInput(fout);
        pb.redirectError(ferror);
        pb.start();
     
        
        
        
      /*
        try{
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c); 
                 is.close();
       
        }catch (Exception e){
            e.printStackTrace();
        }
     */
    }
}
