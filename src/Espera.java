/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Espera {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        System.out.print("Nombre: ");
        if(args.length > 0){
            System.out.printf("Nombre: %s %n", args[0]);
        }else{
            System.out.print(s.nextLine());
        } 
    }
}
