package Pet;

import java.util.Scanner;

public class Principal {
    static Animal animal= new Animal();
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("qual comida seu animal comeu?");
        String comida = leia.next();
        
        System.out.println("quantos metros seu pet andou?");
        int metros = leia.nextInt();
        
        System.out.println("quanto tempo seu pet dorme?");
        double horas = leia.nextDouble();
        
        System.out.println("seu animalzinho comeu>" +comida+ "ele andou "+ metros+
                "metros" + " sou sono é de" +horas + " horas");
    }
}
