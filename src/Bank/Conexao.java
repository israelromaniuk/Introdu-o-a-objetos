package Bank;

//Classes necessárias para uso de Banco de dados //
import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Connection;
import java.util.Scanner;

//Início da classe de conexão//
public class Conexao {
    
    static Scanner leia = new Scanner(System.in);

    public static String status = "Não conectou...";

//Método de Conexão//
    public static void main(String[] args) {
        Connection connection = null;          //atributo do tipo Connection

        try {

            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase = "bank";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD      
            String password = "123456";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            Statement stmt = connection.createStatement();

            String sql;
            
            sql = "CREATE TABLE `Funcionario`("
            + "`Nome` TEXT NOT NULL,"
            + "`RG` INT,"
            + "`Sobrenome` TEXT,"
            + "`Departamento` TEXT,"
            + "`Data_de_entrada` TEXT,"
            + "`Salario` REAL);";
            stmt.executeUpdate(sql);
            
            for(int x = 0; x < 73;){
            System.out.println("Digite o nome do funcionario ");
            String nome = leia.nextLine();
            System.out.println("Digite o sobrenome do funcionario ");
            String sobrenome = leia.nextLine();
            System.out.println("Digite o RG");
            String rg = leia.nextLine();
            int r =Integer.parseInt(rg);
            System.out.println("Digite o departamento");
            String departamento = leia.nextLine();
            System.out.println("Digite a data de entrada");
            String data = leia.nextLine();
            System.out.println("Digite o salario do funcionario");
            String salario = leia.nextLine();
            int s =Integer.parseInt(salario);
            
            //Adicionando valores a tabela
            sql = "INSERT INTO `Funcionarios`(`Nome`,`Sobrenome`, `RG`, `Departamento`,`Data_de_entrada`,"
                    + "`Salario`)"+ "VALUES ('"+nome+"','"+sobrenome+"', "+r+", '"+departamento+"',"
                    + "'"+data+"','"+s+"')";
            stmt.executeUpdate(sql);
            
                System.out.println("Deseja executar novamente ? (SIM/NAO)");
                String resp = leia.nextLine();
                
                if(resp.equalsIgnoreCase("sim")){
                    
                }else{
                    x = 73;
                }
            }

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

        }
    }
}
