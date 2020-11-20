/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eduar
 */
public class Ejemplo6 {
    public static void main(String[] args) {
        ProcessBuilder test  = new ProcessBuilder();
        Map entorno = test.environment();
        System.out.println("Variables de entorno: ");
        System.out.println(entorno);
        
        test = new ProcessBuilder("java", "LeerNombre", "Maria Jesús");
        
        //devuelve el nombre del proceso y sus argumentos
        List l = test.command();
        Iterator iter = l.iterator();
        System.out.print("\nArgumentos del comando: ");
        while(iter.hasNext())
            System.out.println(iter.next());
        
        test = test.command("CMD", "/C", "DIR");
        try{
            Process p = test.start(); //se ejecuta DIR
            
             InputStream is = p.getInputStream();
            int c;
            System.out.println();
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
