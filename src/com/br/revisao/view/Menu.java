package com.br.revisao.view;

import com.br.revisao.controller.FloriculturaClient;
import com.br.revisao.controller.FloriculturaProduct;
import java.util.Scanner;

public class Menu {

    //aonde vai estar o menu 
    static Scanner leia = new Scanner(System.in);
    static FloriculturaClient flor = new FloriculturaClient();
    static FloriculturaProduct fll = new FloriculturaProduct();
    
    public static void main(String[] args) {
        boolean exit = true;
        while (exit) {
            System.out.println("------------ MENU -------------");
            System.out.println("1 -- ADICIONA CLIENTE----------");
            System.out.println("2 -- LISTA CLIENTE-------------");
            System.out.println("3 -- REMOVE CLIENTE------------");
            System.out.println("4 -- ADICIONA PRODUTO----------");
            System.out.println("5 -- LISTA PRODUTO-------------");
            System.out.println("6 -- REMOVE PRODUTO------------");
            System.out.println("0 -- EXIT----------------------");
            System.out.println("-------------------------------");
            int opcao = leia.nextInt();
            switch (opcao) {

                case 1:
                    flor.adicionaCliente();
                    break;
                case 2:
                    flor.listaCliente();
                    break;
                case 3:
                    flor.removeCliente();
                    break;
                case 4:
                    fll.adicionaProduto();
                    break;
                case 5:
                    fll.listaProduto();
                    break;
                case 6:
                    fll.removeProduto();
                    break;
                default:
                    System.out.println("Obrigado!!");
                    exit = false;
                    break;
            }

        }
    }
}
