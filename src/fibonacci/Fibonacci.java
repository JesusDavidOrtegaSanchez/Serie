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
        long num=0;
        int fin=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa hasta el número que desee:");
        fin=leer.nextInt();
        for(int i=0; i<fin; i++){
            num=SerieFibonacci(i);
        }
        System.out.println("El numero final es: "+num);
                
    }
    public static int SerieFibonacci(int n){
        if(n>1){
            return SerieFibonacci(n-1)+ SerieFibonacci(n-2);
        } else if(n==1){
            return 1;
        } else if(n==0){
            return 0;
        } else{
            System.out.println("Ingresar un numero igual o mayor a 1");
            return -1;
        }
    }
    
}
