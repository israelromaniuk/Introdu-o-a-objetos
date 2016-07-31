package CopelKw;

public class Station {
    
    double energia1;
    
    boolean sacaKw(double quantidade){
        if (this.energia1<quantidade){
            return false;
        }else{
            double novoSaldo = this.energia1 -quantidade;
            this.energia1= novoSaldo;
            return true;
        }
    }
    
    void depositaKw(double quantidade){
        this.energia1 += quantidade;
    }
    boolean transeferePara(Station destino, double valor){
        boolean retirou = this.sacaKw(valor);
        if(retirou == false){
            return false;
        }else{
            destino.depositaKw(valor);
            return true;
        }
    }
}
