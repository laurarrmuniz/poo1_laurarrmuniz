public class Main
{
    public static void main(String args[]){

        ContaCorrente conta = new ContaCorrente(150,6,123456);

        System.out.println(conta.debitaValor(100,123456));
        System.out.println("Valor debitado: " + conta.debitaValor(1000.0f));
        System.out.println("Valor creditado: " + conta.creditaValor(123456,100.0f));
        System.out.println(conta.getEstado(123456));
        System.out.println();

        ContaCorrente conta2 = new ContaCorrente(0,2,1234567);

        System.out.println(conta2.debitaValor(0,1234567));
    }
}
