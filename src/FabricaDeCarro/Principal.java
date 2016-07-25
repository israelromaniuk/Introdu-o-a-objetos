package FabricaDeCarro;

import java.util.Scanner;

public class Principal {
    static Carro meuCarro = new Carro();
    static Scanner leia = new Scanner(System.in);
    static double velmax;
    public static void main(String[] args) {
        System.out.println("Qual a cor do seu carro?");
        String corDoCarro =leia.next();
        meuCarro.cor =corDoCarro;
        System.out.println("Qual o modelo do carro?");
        String modeloDoCarro =leia.next();
        meuCarro.modelo =modeloDoCarro;
        System.out.println("O carro sempre se inicia em 0");
        meuCarro.velocidadeAtual =0;
        System.out.println("Qual a velocidade maxima do carro?");
        velmax=leia.nextDouble();
        meuCarro.velocidadeMaxima =velmax;
        System.out.println("-------------------");
        System.out.println("cor: "+meuCarro.cor+"\n"+"modelo: "+meuCarro.modelo+"\n"+
                "velocidade atual: "+meuCarro.velocidadeAtual+"\n"+"velocidade max: "
                +meuCarro.velocidadeMaxima);
        System.out.println("--------------------");
        
        meuCarro.liga();
        
        
        
        System.out.println("Qual sua velocidade agr?");
        double velocidadeagr1 = leia.nextDouble();
        if(velocidadeagr1>meuCarro.velocidadeMaxima){
            System.out.println("Seu carro não chega a essa velocidade!");
        }else{
            System.out.println("Sua velocidade agora é de: "+meuCarro.velocidadeAtual+ "Km/h");
        }
        meuCarro.acelera(velocidadeagr1);
        
        System.out.println("Qual sua velocidade agr?");
        double velocidadeagr2 = leia.nextDouble();
        if(velocidadeagr2>meuCarro.velocidadeMaxima){
            System.out.println("Seu carro não chega a essa velocidade!");
        }else{
            System.out.println("Sua velocidade agora é de: "+meuCarro.velocidadeAtual+ "Km/h");
        }
        meuCarro.acelera(velocidadeagr2);

    }
}
