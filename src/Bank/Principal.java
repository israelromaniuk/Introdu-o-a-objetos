package Bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    static Scanner leia = new Scanner(System.in);
    static Funcionario funcio = new Funcionario();
    static DecimalFormat df = new DecimalFormat();

    public static void main(String[] args) {

        boolean exit = true;
        while (exit) {
            System.out.println("1 - Adicionar Funcionario");
            System.out.println("2 - Listar Funcionario");
            System.out.println("0 - Exit");
            int opcao = leia.nextInt();
            switch (opcao) {

                case 1:
                    funcio.adicionaFuncionario();
                    break;
                case 2:
                    funcio.listaFuncionario();
                    break;
                default:
                    System.out.println("Obrigado!!");
                    exit = false;
                    break;
            }

        }
        //arrumar n exibe o reajuste
        /*System.out.println("Deseja dar aumento para este funcionario?");
         String aumento= leia.next();
         if(aumento.equalsIgnoreCase("sim")){
         System.out.println(df.format(funcio.salario*10/100));
            
         }else{
         System.out.println("Sem aumento :)");
         }*/
        /*System.out.println("O salario anual do Funcionario " + funcio.nome + " é de: "
        + df.format(funcio.calculoGanhoAnual()));*/
    }
}
