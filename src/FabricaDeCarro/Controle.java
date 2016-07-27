package FabricaDeCarro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    static List<Carro> carros = new ArrayList<Carro>();
    static Carro meuCarro = new Carro();
    static Scanner leia = new Scanner(System.in);
    static Motor mtr = new Motor();
    
    public static void main(String[] args) {
        int x =0;
        while(x<3){
        Carro carr = new Carro();
        carros.add(carr);
        
        carr.cor ="verde";
        carr.modelo ="fusca";
        carr.velocidadeAtual=0;
        carr.velocidadeMaxima=85;
        mtr.potencia = 1300;
        x++;
        }
        
    for(Carro c : carros){
        System.out.println(c.cor);
        System.out.println(c.modelo);
        System.out.println(c.motor);
        System.out.println(c.velocidadeAtual);
        System.out.println(c.velocidadeMaxima);
        }
    }
}
