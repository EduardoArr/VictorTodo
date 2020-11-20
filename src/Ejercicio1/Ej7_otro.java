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
public class Ej7_otro {
     public static void main(String[] args) throws IOException{
        File directorio = new File("D:\\netbeans proyectos\\Victo\\src\\Ejercicio1");
        ProcessBuilder pb = new ProcessBuilder("java", "Ej7.java");
        pb.directory(directorio);
        
        
        //File archivo = new File("Salida.txt");
        //pb.redirectOutput(archivo);
     
        
         Process p = pb.start();
         
        OutputStream os = p.getOutputStream();//escribir en el stream de entrada
        os.write("Hola me llamo edu\n".getBytes()); //codificar la cadena
        os.flush(); //vaciar buffer
        
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
        
        
        int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      
    }
}
