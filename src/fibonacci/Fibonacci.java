/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author kempo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=0;
        int c=1;
        int fin=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa hasta el número que desee:");
        fin=leer.nextInt();
        for(int i=0; i<fin; i++){
            a=b;
            b=c+b;
            c=a;
            System.out.println(c);
        }
    }
    
}
