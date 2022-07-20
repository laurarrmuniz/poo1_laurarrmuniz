import java.util.Scanner;

public class FaceFriends {
    Scanner entrada = new Scanner(System.in);

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1- Inserir Contato");
        System.out.println("2- Imprimir Contatos");
        System.out.println("3- Imprimir Familiares");
        System.out.println("4- Imprimir Amigos");
        System.out.println("5- Imprimir Colegas de Trabalho");
        System.out.println("6- Imprimir Melhores amigos, Irmãos e Colegas de trabalho");
        System.out.println("7- Sair");
        System.out.println();
    }

    public static void inserir() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 1 para inserir Familia/ Digite 2 para inserir Amigos/ Digite 3 para inserir Trabalho");
        System.out.print("Digite o tipo: ");
        int n = entrada.nextInt();
        if (n == 1) {
            entrada.nextLine();
            System.out.print("Apelido: ");
            String apelido = entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("E-mail: ");
            String email = entrada.nextLine();
            System.out.print("Aniversário: ");
            String aniversario = entrada.nextLine();
            System.out.print("Grau de parentesco: ");
            String parentesco = entrada.nextLine();
            System.out.println();
            Familia contato1 = new Familia(apelido,nome,email,aniversario,parentesco);
        } else if (n == 2) {
            entrada.nextLine();
            System.out.print("Apelido: ");
            String apelido = entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("E-mail: ");
            String email = entrada.nextLine();
            System.out.print("Aniversário: ");
            String aniversario = entrada.nextLine();
            System.out.print("Grau de amizade: ");
            int grau = entrada.nextInt();
            System.out.println();
            Amigos contato2 = new Amigos(apelido, nome,email,aniversario,grau);
        } else if (n == 3) {
            entrada.nextLine();
            System.out.print("Apelido: ");
            String apelido = entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("E-mail: ");
            String email = entrada.nextLine();
            System.out.print("Aniversário: ");
            String aniversario = entrada.nextLine();
            System.out.print("Tipo: ");
            String tipo = entrada.nextLine();
            System.out.println();
            Trabalho contato3 = new Trabalho(apelido,nome,email,aniversario,tipo);
        } else {
            System.out.println("Erro de entrada. Digite um número de 1 a 3");
            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        Familia contato1 = new Familia("Juliana","Juliana Souza","ju@hotmail.com", "17/08/02", "irmã");
        Amigos contato2 = new Amigos("Jose","Jose Silva","jose@hotmail.com","14/09/02",1);
        Trabalho contato3 = new Trabalho("Maria","Maria Silva","maria@hotmail.com","02/01/01","chefe");

        Contato[] contato = new Contato[3];
        contato[0] = contato1;
        contato[1] = contato2;
        contato[2] = contato3;

        int opcao;

        do {
            menu();
            opcao = entrada.nextInt();

            if(opcao == 1){
                inserir();

            }else if(opcao == 2){
                contato1.imprimeContato();
                System.out.println();
                contato2.imprimeContato();
                System.out.println();
                contato3.imprimeContato();
                System.out.println();
            }
        }while(opcao != 7);

    }
}