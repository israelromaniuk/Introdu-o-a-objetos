package Biblioteca;

import Bank.Funcionario;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    
    static Scanner leia = new Scanner(System.in);
    static Livros liv = new Livros();
    static DecimalFormat df = new DecimalFormat();
    
    public static void main(String[] args) {
        
                boolean exit = true;
        while (exit) {
                    System.out.println
        (" _______________________________\n" +
"|1 - ADICIONAR LIVROS          |\n" +
"|2 - LISTAR LIVROS             |\n" +
"|3 - REMOVER                   |\n" +
"|0 - EXIT                      |\n" +
"|_______________________________|");
           
            int opcao = leia.nextInt();
            switch (opcao) {
                    
                case 1:
                    liv.adicionaLivro();
                    break;
                case 2:
                    liv.listaLivro();
                    break;
                case 3:
                    liv.removeLivro();
                    break;
                default:
                    System.out.println("Obrigado!!");
                    exit = false;
                    break;
            }

        }

    }
    
    
    
}
