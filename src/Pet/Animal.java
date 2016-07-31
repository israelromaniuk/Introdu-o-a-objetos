package Pet;

public class Animal {
    String nome;
    String cor;
    String raca;
    int idade;
    String dono;
    
    String come(String comida){
        return "Seu pet comeu tudo!";
    }
    String anda(int quantidade){
        return "Seu pet andou"+quantidade+"metros!";
    }
    String dorme(double horas){
        return "Seu pet dormiu"+horas+"hrs!!"; 
    }
}

