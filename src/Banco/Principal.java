package Banco;

import java.util.Scanner;

public class Principal {
    //criando conta
    static Conta minhaConta = new Conta();
    static Conta ContaDoFulano = new Conta();
    
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        //alterando os valores
        minhaConta.dono ="israel";
        minhaConta.saldo =15633;
        //tirando dinheiro
        System.out.println("Saldo atual "+minhaConta.saldo);
        System.out.println("Deseja sacar quanto ?");
        double quant= leia.nextDouble();
        if(minhaConta.saca(quant)){
            System.out.println("Saque efetuado com sucesso!!");
        }else{
            System.out.println("Saldo insuficiente");
        }
        //colocando dinheiro
        System.out.println("Deseja depositar quanto?");
        double quanto= leia.nextDouble();
        minhaConta.deposita(quanto);
        System.out.println("Novo saldo "+minhaConta.saldo);
        
        System.out.println("Deseja transeferir quanto ?");
        double transferir= leia.nextDouble();
        minhaConta.transeferePara(ContaDoFulano, transferir);
        System.out.println("Saldo contado fulano "+ContaDoFulano.saldo);
        
    }
}
