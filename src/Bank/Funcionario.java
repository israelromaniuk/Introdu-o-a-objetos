package Bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    static Scanner leia = new Scanner(System.in);
    static Funcionario funcio = new Funcionario();
    static DecimalFormat df = new DecimalFormat();
    List<Funcionario> func = new ArrayList<Funcionario>();

    String nome, departamento, dataEntrada;
    int rg;
    double salario;

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculoGanhoAnual() {
        double anual = this.salario * 12;
        return anual;
    }

    void adicionaFuncionario() {
        System.out.println("Qual o nome do funcionario?");
        String nomeDoFuncionario = leia.next();
        funcio.nome = nomeDoFuncionario;
        System.out.println("Digite o rg do funcionario");
        int rgDoFuncionario = leia.nextInt();
        funcio.rg = rgDoFuncionario;
        System.out.println("Qual o departamento que ele trabalha?");
        String depa = leia.next();
        funcio.departamento = depa;
        System.out.println("Quando ele começou a trabalhar");
        String começo = leia.next();
        funcio.dataEntrada = começo;
        System.out.println("Qual o salario do funcionario?");
        double salarioFunc = leia.nextDouble();
        funcio.salario = salarioFunc;
        func.add(funcio);
    }

    void listaFuncionario() {
        for (Funcionario c : func) {
            System.out.println("-----------------------");
        System.out.println("Nome do func: " + c.nome + "\n"
                + "Rg do func: " + c.rg + "\n" + "Departamento: " + c.departamento + "\n"
                + "DataDeEntrada: " + c.dataEntrada + "\n" + "Salario: " + df.format(c.salario));
        System.out.println("-----------------------");
        }
    }
}
