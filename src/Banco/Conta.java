package Banco;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    
    boolean saca(double quantidade){
        if (this.saldo<quantidade){
            return false;
        }else{
            double novoSaldo = this.saldo -quantidade;
            this.saldo= novoSaldo;
            return true;
        }
    }
    
    void deposita(double quantidade){
        this.saldo += quantidade;
    }
    boolean transeferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == false){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }
}
