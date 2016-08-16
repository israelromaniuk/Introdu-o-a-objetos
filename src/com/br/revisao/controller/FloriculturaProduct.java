package com.br.revisao.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloriculturaProduct {

    //Array list e Scanner
    List<FloriculturaProduct> fll = new ArrayList<FloriculturaProduct>();
    static Scanner leia = new Scanner(System.in);

    String nomeProdut, tipo;
    double preco;
    int quantidadeEstoq;

    public void adicionaProduto() {
        FloriculturaProduct flr = new FloriculturaProduct();
        System.out.println("PRODUTO> ");
        String prod = leia.nextLine();
        flr.nomeProdut = prod;

        System.out.println("TIPO> ");
        String tip = leia.nextLine();
        flr.tipo = tip;

        System.out.println("PREÇO> ");
        double prec = Double.parseDouble(leia.nextLine());
        flr.preco = prec;

        System.out.println("QUANTIDADE DE " + prod);
        int quant = leia.nextInt();
        flr.quantidadeEstoq = quant;
        fll.add(flr);

    }

    public void listaProduto() {

        for (FloriculturaProduct f : fll) {
            System.out.println("-------------------------------");
            System.out.println("-------- LISTA PRODUTOS -------");
            System.out.println("-------------------------------");
            System.out.println("NOME DO PRODUTO> " + f.nomeProdut + "\n"
                    + "TIPO DO PRODUTO> " + f.tipo + "\n" + "PREÇO DO PRODUTO> " + f.preco + "\n"
                    + "QUANTIDADE EM ESTOQUE> " + f.quantidadeEstoq);
        }

    }

    public void removeProduto() {
        System.out.println("-------------------------------");
        System.out.println("------- REMOVE PRODUTO --------");
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("QUAL O NOME DO PRODUTO QUE DESEJA EXCLUIR?");
        String nomeC = leia.next();
        for (FloriculturaProduct f : fll) {
            if (nomeC.equalsIgnoreCase(f.nomeProdut)) {
                fll.remove(f);
                System.out.println("PRODUTO EXCLUIDO!");
                break;
            } else {
                System.out.println("PRODUTO NAO ENCONTRADO!");
                System.out.println("-------------------------------");
            }
        }

    }

}
