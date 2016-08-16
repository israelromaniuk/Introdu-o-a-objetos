package com.br.revisao.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloriculturaClient {

    //Array list e Scanner
    List<FloriculturaClient> flor = new ArrayList<FloriculturaClient>();
    static Scanner leia = new Scanner(System.in);
    //variaveis
    String nome, endereco;
    int telefone;

    public void adicionaCliente() {

        FloriculturaClient flr = new FloriculturaClient();
        System.out.println("CLIENTE> ");
        String client = leia.nextLine();
        flr.nome = client;

        System.out.println("ENDEREÇO> ");
        String ender = leia.nextLine();
        flr.endereco = ender;

        System.out.println("TELEFONE> ");
        int tel = leia.nextInt();
        flr.telefone = tel;
        flor.add(flr);

    }

    public void listaCliente() {

        for (FloriculturaClient f : flor) {
            System.out.println("-------------------------------");
            System.out.println("-------- LISTA CLIENTES -------");
            System.out.println("-------------------------------");
            System.out.println("NOME DO CLIENTE> " + f.nome + "\n" + "ENDEREÇO> " + f.endereco + "\n"
                    + "TELEFONE> " + f.telefone);
            System.out.println("-------------------------------");
        }
    }

    public void removeCliente() {

        System.out.println("-------------------------------");
        System.out.println("------- REMOVE CLIENTE --------");
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("QUAL O NOME DO CLIENTE QUE DESEJA EXCLUIR?");
        String nomeC = leia.next();
        for (FloriculturaClient f : flor) {
            if (nomeC.equalsIgnoreCase(f.nome)) {
                flor.remove(f);
                System.out.println("CLIENTE EXCLUIDO!");
                break;
            } else {
                System.out.println("CLIENTE NAO ENCONTRADO!");
                System.out.println("-------------------------------");
            }
        }
    }

}
