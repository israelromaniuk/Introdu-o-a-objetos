package Biblioteca;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livros {

    static Scanner leia = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat();
    List<Livros> livr = new ArrayList<Livros>();

    String autor, titulo, editora, categoria;
    double preco;

    void adicionaLivro() {
        Livros liv = new Livros();
        System.out.println("QUAL O NOME DO LIVRO > ");
        String tit = leia.next();
        liv.titulo = tit;
        System.out.println("QUAL O NOME DO AUTOR DO LIVRO > ");
        String aut = leia.next();
        liv.autor = aut;
        System.out.println("QUAL A CATEGORIA DO LIVRO> ");
        String categ = leia.next();
        liv.categoria = categ;
        System.out.println("QUAL A EDITORA > ");
        String edito = leia.next();
        liv.editora = edito;
        System.out.println("PREÇO DO LIVRO > ");
        double prec = leia.nextDouble();
        liv.preco = prec;
        livr.add(liv);

    }

    void listaLivro() {
        for (Livros l : livr) {
            System.out.println("-------------------------------");
            System.out.println("------- LISTA DE LIVROS -------");
            System.out.println("-------------------------------");
            System.out.println("NOME DO LIVRO> " + l.titulo + "\n" + "AUTOR DO LIVRO> " + l.autor + "\n"
                    + "CATEGORIA DO LIVRO> " + l.categoria + "\n" + "EDITORA DO LIVRO> " + l.editora + "\n"
                    + "PREÇO DO LIVRO> R$" + l.preco);
            System.out.println("-------------------------------");
        }
    }

    void removeLivro() {
        System.out.println("------- REMOVE LIVRO ----------");
        System.out.println("-------------------------------");
        System.out.println("QUAL NOME DO LIVRIO QUE DESEJA EXCLUIR");
        String nomeL = leia.next();
        for (Livros li : livr) {
            if (nomeL.equals(li.titulo)) {
                livr.remove(li);
                System.err.println("LIVRO EXCLUIDO!!");
                break;
            } else {
                System.out.println("NÃO EXISTE ESSE LIVRO NOS CADASTROS");
                System.out.println("-------------------------------");
            }
        }
    }
}
