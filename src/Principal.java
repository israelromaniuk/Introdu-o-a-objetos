
import java.util.Scanner;

public class Principal {
    static Aluno a = new Aluno();
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        a.nome = leia.next();
        System.out.println("Digite sua idade");
        a.idade = leia.nextInt();
        System.out.println("Digite sua nacionalidade");
        a.nacionalidade = leia.next();
        System.out.println("Digite seu sexo (M/F)");
        a.sexo = leia.next();
        System.out.println("Digite sua data de nascimento");
        a.nascimento = leia.next();
        
        System.out.println("Aluno: "+a.nome+"\n"+"Idade: "+a.idade+
                "\n"+"Nacionalidade: "+a.nacionalidade+"\n"+"Sexo: "+a.sexo+"\n"
                +"Nascimento"+a.nascimento);
    }
    
}
