package FabricaDeCarro;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;
    //Liga o carro
    void liga(){
        System.err.println("O carro esta ligado!!");
    }
    
    void acelera(double quantidade){
        double velocidadeNova = this.velocidadeAtual+quantidade;
        this.velocidadeAtual= velocidadeNova;
    }
}
