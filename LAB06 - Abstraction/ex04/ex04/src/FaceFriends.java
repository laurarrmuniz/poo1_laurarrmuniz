import java.sql.SQLOutput;
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
        System.out.println("7- Imprimir os dados de um único contato");
        System.out.println("8- Sair");
        System.out.println();
    }

    public static Contato inserir() {
        Scanner entrada = new Scanner(System.in);
        Contato c = null;

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
            c = new Familia(apelido, nome, email, aniversario, parentesco);
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
            c = new Amigos(apelido, nome, email, aniversario, grau);
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
            c = new Trabalho(apelido, nome, email, aniversario, tipo);
        } else {
            System.out.println("Erro de entrada. Digite um número de 1 a 3");
            System.out.println();
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        Contato[] contato = new Contato[4];

        int opcao;
        int ncontato = 0;
        do {
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                if (ncontato == 4)
                    ncontato = 0;

                contato[ncontato] = inserir();
                ncontato++;

            } else if (opcao == 2) {
                for (int i = 0; i < ncontato; i++) {
                    String s = contato[i].imprimeContato();
                    System.out.println(s);
                }

            } else if (opcao == 3) {
                for (int i = 0; i < ncontato; i++) {
                    if (contato[i] instanceof Familia) {
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }
                }
            } else if (opcao == 4) {
                for (int i = 0; i < ncontato; i++) {
                    if (contato[i] instanceof Amigos) {
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }
                }
            } else if (opcao == 5) {
                for (int i = 0; i < ncontato; i++) {
                    if (contato[i] instanceof Trabalho) {
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }
                }
            }else if (opcao == 6) {
                for (int i = 0; i < ncontato; i++) {
                    if (contato[i] instanceof Amigos && ((Amigos) contato[i]).grau == 1) {
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }else if (contato[i] instanceof Familia && ((Familia) contato[i]).parentesco.equals("irmão")){
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }else if (contato[i] instanceof Trabalho && ((Trabalho) contato[i]).tipo.equals("colega")){
                       String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }
                }
            }else if(opcao == 7){
                System.out.print("Nome do contato: ");
                String nome = entrada.nextLine();
                for (int i = 0; i < ncontato; i++){
                    if(contato[i].nome.equals(nome)){
                        System.out.println(contato[i].getClass());  //getClass retorna a classe
                        String s = contato[i].imprimeContato();
                        System.out.println(s);
                    }
                }
            }
        }while (opcao != 8) ;
    }
}