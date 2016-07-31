package CopelKw;

import java.util.Scanner;

public class Principal {
    static Station station1= new Station();
    static Station station2= new Station();
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        station1.energia1 =10000;
        System.out.println("energia na 1station "+station1.energia1);
        System.out.println("Quanto sera na transferencia em KW ?");
        int kw = leia.nextInt();
        station1.transeferePara(station2, kw);
        System.out.println("A nova quantidade de energia na station 2 é de "+station2.energia1);
        System.out.println("A quantidade de energia na station 1 é de "+station1.energia1);
    }
}
