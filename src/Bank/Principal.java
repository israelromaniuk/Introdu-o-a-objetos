package Bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    static Scanner leia = new Scanner(System.in);
    static Funcionario funcio = new Funcionario();
    static DecimalFormat df = new DecimalFormat();
    public static void main(String[] args) {
        
        System.out.println("Qual o nome do funcionario?");
        String nomeDoFuncionario =leia.next();
        funcio.nome=nomeDoFuncionario;
        System.out.println("Digite o rg do funcionario");
        int rgDoFuncionario =leia.nextInt();
        funcio.rg=rgDoFuncionario;
        System.out.println("Qual o departamento que ele trabalha?");
        String depa =leia.next();
        funcio.departamento=depa;
        System.out.println("Quando ele começou a trabalhar");
        String começo= leia.next();
        funcio.dataEntrada=começo;
        System.out.println("Qual o salario do funcionario?");
        double salarioFunc=leia.nextDouble();
        funcio.salario=salarioFunc;
        
        System.out.println("-----------------------");
        System.out.println("Nome do func: "+funcio.nome+"\n"
                +"Rg do func: "+funcio.rg+"\n"+"Departamento: "+funcio.departamento+"\n"
                +"DataDeEntrada: "+funcio.dataEntrada+"\n"+"Salario: "+df.format(funcio.salario));
        System.out.println("-----------------------");
        
        //arrumar n exibe o reajuste
        /*System.out.println("Deseja dar aumento para este funcionario?");
        String aumento= leia.next();
        if(aumento.equalsIgnoreCase("sim")){
            System.out.println(df.format(funcio.salario*10/100));
            
        }else{
            System.out.println("Sem aumento :)");
        }*/
        System.out.println("O salario anual do Funcionario "+funcio.nome+ " é de: "
                +df.format(funcio.calculoGanhoAnual()));
    }
}
