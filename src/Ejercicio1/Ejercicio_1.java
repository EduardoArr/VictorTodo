/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;



/**
 *
 * @author eduar
 */
public class Ejercicio_1 {
      public static void main(String[] args) {		
		if(args.length!=1){
			System.out.print("Argumentos incorrectos en main()");
			System.exit(-1);
		}
		System.out.printf("Nombre: %s %n", args[0]);
		System.exit(1);
	}
}
