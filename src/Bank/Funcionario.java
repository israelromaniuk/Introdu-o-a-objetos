package Bank;

public class Funcionario {
    String nome, departamento, dataEntrada;
    int rg;
    double salario;
    
    void recebeAumento(double aumento){
        this.salario +=aumento;
    }
    double calculoGanhoAnual(){
        double anual =this.salario*12;
        return anual;
    }
}
