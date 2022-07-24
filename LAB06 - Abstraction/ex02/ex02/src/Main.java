import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o limite de crédito da Conta Especial: ");
        float limite = entrada.nextFloat();

        if(limite == 0){
            System.out.println("Sua conta é comum!");
            entrada.nextLine();
            System.out.print("Saldo: ");
            float saldo = entrada.nextFloat();
            System.out.print("Número da Conta: ");
            int numConta = entrada.nextInt();
            System.out.print("Senha: ");
            int senha = entrada.nextInt();
            ContaComum conta = new ContaComum(saldo,numConta,senha, 0);
        }else if(limite > 0){
            System.out.print("Saldo: ");
            float saldo = entrada.nextFloat();
            System.out.print("Número da Conta: ");
            int numConta = entrada.nextInt();
            System.out.print("Senha: ");
            int senha = entrada.nextInt();
            ContaEspecial contaEspecial = new ContaEspecial(saldo,numConta,senha,limite);
        }
    }
}
