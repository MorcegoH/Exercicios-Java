package desafio;

import java.lang.ref.Cleaner.Cleanable;
import java.lang.reflect.WildcardType;
import java.util.Scanner; //Necessario para uso da classe.

import javax.swing.table.DefaultTableCellRenderer;

import jdk.nashorn.api.tree.WhileLoopTree;

//Programa simulando um dado de 10 lados.

//3 partes;
// 1 - Painel de selecao
// 2 - Lancamento ou Recusa
// 3 - Mensagem de Encerramento

public class D10 {

    public static void main(String[] args) {
        //Variavel
        int d10, opc;

        //Parte 1 - Painel de escolha
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----> Dado D10 <-----");
        System.out.println("");
        System.out.println("Deseja jogar o dado?");
        System.out.println("");
        System.out.print("1 - Yes ");
        System.out.println(" 2 - No");
        System.out.println("");

        opc = teclado.nextInt();
        System.out.println("");
        // Parte 2 - Condicao para lancamento
        switch (opc) {
            case 1:
                while (opc == 1) {
                d10 = (int) (Math.random() * 10 + 1); 
                System.out.println("O resultado eh: " + d10);
                System.out.println("");
                System.out.println("Deseja Jogar novamente?");
                System.out.println("");
                System.out.print("1 - Yes ");
                System.out.println(" 2 - No");
                opc = teclado.nextInt();
                System.out.println("");
                }
                break;
            case 2:
                System.out.println("#################################");
                System.out.println("#################################"); 
                System.out.println("////// Aplicacao Encerrada //////");
                System.out.println("#################################");
                System.out.println("#################################");
                break;
            default:
                System.out.println("Escolha Inválida!!");
                System.out.println("");
                System.out.println("");    
                break; 
            
            }

        // Parte 3 - Encerramento
        System.out.println("#################################");
        System.out.println("#################################"); 
        System.out.println("////// Aplicacao Encerrada //////");
        System.out.println("#################################");
        System.out.println("#################################");
    }    
}        
    
