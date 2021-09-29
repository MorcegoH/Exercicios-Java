
package desafios;

import java.util.Scanner;


public class Tabuada { 

    public static void main(String[] args) {


        //Estrutura Basica
    	
        System.out.println("##### TABUADA #####");
        System.out.println("");
        System.out.println("Digite o nº que deseja a tabuada: ");
        Scanner in = new Scanner(System.in);
        int fat1 = in.nextInt();
        System.out.println("");

        //Contador + calculo
        
        System.out.println("A tabuada do " + fat1 + " é:");
        System.out.println("");
        for (int fat2 = 0; fat2 < 11; fat2++) {
            int produto = fat1 * fat2;
            System.out.println(fat1 + " x " + fat2 + " = " + produto);
            
        }

    }

}
