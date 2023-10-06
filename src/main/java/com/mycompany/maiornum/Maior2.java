
package com.mycompany.maiornum;

public class Maior2 {
    public double n1, n2, n3, maior;
    
    public double maior(){
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }
        else if  (n2 > n1 && n2 > n3) {
            maior = n2;
        }
        else maior = n3;
       return maior;
                
    }
}
