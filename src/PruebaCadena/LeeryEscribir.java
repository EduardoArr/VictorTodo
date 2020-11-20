/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCadena;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author eduar
 */
public class LeeryEscribir {
    public static void main(String[] args) throws IOException {
        File directorio = new File("D:\\netbeans proyectos\\Victo\\src\\PruebaCadena");
        ProcessBuilder pb = new ProcessBuilder("java", "PruebaCadena.java");
        pb.directory(directorio);
        
        Process p = pb.start();
        
        OutputStream os = p.getOutputStream();
        os.write("Hola Manu\n".getBytes());
        os.flush();
        
        try{
            
            InputStream is = p.getInputStream();
            
            int c;
           do{
               c = is.read();
               if(c!=-1){
                 System.out.print((char) c); 
              }
                       
           }while(c!=-1);

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
