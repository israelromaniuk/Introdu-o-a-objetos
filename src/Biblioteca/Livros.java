package Biblioteca;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livros {
    
    static Scanner leia = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat();
    static Livros liv = new Livros();
    List<Livros> livr = new ArrayList<Livros>();
    
    String ano,isbn,tipoDoLivro,estante,autor,titulo,editora,edicao,categoria,capa;
    int codigoDBarras;
    double preco,peso;
    
    void adicionaLivro(){
        System.out.println("Qual o titulo do Livro> ");
        String tit = leia.nextLine();
        liv.titulo =tit;
        System.out.println("Qual o nome do autor do livro> ");
        String aut = leia.nextLine();
        liv.autor=aut;
        System.out.println("Qual o tipo do livro> ");
        String tipo = leia.nextLine();
        liv.tipoDoLivro=tipo;
        System.out.println("Qual a categoria do livro> ");
        String categ = leia.nextLine();
        liv.categoria=categ;
        System.out.println("Qual a estante em que o livro se encontra> ");
        String estant = leia.nextLine();
        liv.estante=estant;
        System.out.println("Qual a editora> ");
        String edito = leia.nextLine();
        liv.editora = edito;
        System.out.println("Qual a isbn do livro> ");
        String isb = leia.nextLine();
        liv.isbn = isb;
        System.out.println("De qual edição é o livro> ");
        String edic = leia.nextLine();
        liv.edicao = edic;
        System.out.println("Qual a capa do livro> ");
        String cap = leia.nextLine();
        liv.capa = cap;
        System.out.println("De que ano é o livro"+"USE (/) DD/MM/AA> ");
        String anoo = leia.nextLine();
        liv.ano = anoo;
        System.out.println("Qual o codigo de barras> ");
        int codigo = leia.nextInt();
        liv.codigoDBarras = codigo;
        System.out.println("Preço do livro> ");
        double prec = leia.nextDouble();
        liv.preco = prec;
        System.out.println("Qual o peso do livro> ");
        double pes = leia.nextDouble();
        liv.peso = pes;
        livr.add(liv);
        
    }
    
    void listaLivro(){
        for (Livros l :livr) {
        System.out.println("-----------------------");
            System.out.println("titulo do livro: "+l.titulo+"\n"+"autor do livro: "+l.autor+"\n"+
                    "editora do livro: "+l.editora+"\n"+"edicao do livro: "+l.edicao+"\n"+
                    "categoria do livro"+l.categoria+"\n"+"tipo do livro"+l.tipoDoLivro+"\n"+
                    "capa do livro: "+l.capa+"\n"+"isbn do livro: "+l.isbn+"\n"+"estante do livro: "
                    +l.estante+"\n"+"ano do livro: "+l.ano+"\n"+"codigo de barras: "+l.codigoDBarras+"\n"+
                    "pesoo do livro: "+l.peso+"g"+"\n"+"preço do livro: R$"+l.preco);
        System.out.println("-----------------------");
        }
    }
    
    void removeLivro(){
        System.out.println("Qual o nome do livro que deseja excluir");
        String nomeL = leia.next();
        for(Livros li:livr){
            if(nomeL.equals(li.titulo)){
                livr.remove(li);
                System.out.println("Livro excluido!!");
                break;
            }else{
                System.out.println("N existe esse livro nos cadastros");
            }
        }
    }
}
