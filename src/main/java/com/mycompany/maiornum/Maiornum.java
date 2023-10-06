
package com.mycompany.maiornum;

import java.util.Scanner;
public class Maiornum {

    public static void main(String[] args) {
       Maior2 m = new Maior2();
       
       Scanner leia1 = new Scanner(System.in);
       System.out.println("Digite o primeiro numero: ");
       m.n1 = leia1.nextDouble();
       
       Scanner leia2 = new Scanner(System.in);
       System.out.println("Digite o segundo numero: ");
       m.n2 = leia2.nextDouble();
       
       Scanner leia3 = new Scanner(System.in);
       System.out.println("Digite o terceiro numero: ");
       m.n3 = leia3.nextDouble();
       
        System.out.println("O maior numero foi: " +m.maior());
    }
}
