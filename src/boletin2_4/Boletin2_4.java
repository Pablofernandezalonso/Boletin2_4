
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

    
    public static void main(String[] args) {
        
        float num1,num2,suma,resta,produto,cociente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un valor");
        num1 = sc.nextFloat();
        System.out.println("Introducir un valor");
        num2 = sc.nextFloat();
        suma = num1+num2;
        resta = num1-num2;
        produto = num1*num2;
        cociente = num1/num2;
        System.out.println(num1+"+"+num2+"=" + suma);
        System.out.println(num1+"-"+num2+"=" + resta);
        System.out.println(num1+"*"+num2+"=" + produto);
        System.out.println(num1+"/"+num2+"=" + cociente);
        
    }
    
        
    
}
