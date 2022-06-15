public class GerenciadorDePessoas
{
    public static void main (String args[])
    {
        Pessoa p1 = new Pessoa ();

        p1.nome = "Vitor Pereira";
        p1.idade = 25;
        p1.profissao = "Professor";
        p1.dinheiroNaCarteira = 3200.00;
        System.out.println( "Salário de " + p1.nome + " = " + p1.dinheiroNaCarteira);

        // Vitor recebeu 1000.00 reais
        p1.receber( 1000.00 );
        System.out.println( p1.nome + " tem " + p1.dinheiroNaCarteira + " reais");

        // Vitor gastou 200 reais
         p1.gastar( 200.00 );
        System.out.println( p1.nome + " tem agora " + p1.dinheiroNaCarteira + " reais");

        // Declarando outro objeto da classe Pessoa
        Pessoa p2 = new Pessoa ();

        // Atribuindo valor aos atributos
        p2.nome = "João Silveira";
        p2.idade = 30;
        p2.dinheiroNaCarteira = 1200.00;
        System.out.println( "Salário de " + p2.nome + " = " + p2.dinheiroNaCarteira );

        // João recebeu 400.00 reias
        p2.receber(400.00);
        System.out.println( p2.nome + " tem " + p2.dinheiroNaCarteira + " reais");

        // João gastou 100.00 reais
        p2.gastar( 100.00 );
        System.out.println( p2.nome + " tem agora " + p2.dinheiroNaCarteira + " reais");
    }
}
