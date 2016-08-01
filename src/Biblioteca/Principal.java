package Biblioteca;

import Bank.Funcionario;
import java.awt.BorderLayout;
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
        ("------------ MENU -------------");
                    System.out.println
        ("1 -- ADICIONA LIVRO------------");
                    System.out.println
        ("2 -- LISTA LIVRO---------------");
                    System.out.println
        ("3 -- REMOVE LIVRO--------------");
                    System.out.println
        ("0 -- EXIT----------------------");
                    System.out.println
        ("-------------------------------");
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
