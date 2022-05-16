//*Resolução LAB01 - Procedural*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

struct cadatro_produto
{
    char codigo[50];
    char nome_produto[100];
    char fabricante[50];
    char preco[20];
};

struct cadastro_cliente
{
    char cliente_cpf[20];
    char nome_cliente[100];
    char data_nascimento_c[10];
    char cep[10];
};

struct cadastro_funcionario
{
    char funcionario_cpf[20];
    char nome_funcionario[100];
    char data_nascimento_f[10];
    char data_ingresso[10];
};

struct vendas
{
    char funcionario[100];
    char cliente[100];
    char codigo_produto[20];
    char n_produto[20];
};

//1
//Funcao para o cadastro de produtos
void cadastro1(struct cadatro_produto T[], int *qtd)
{
    FILE *f;
    f = fopen ("arquivo_cadastro_produto.txt", "a"); //cria arquivo

    if (f==NULL)
    {
        printf("Erro na abertura do arquivo!\n"); //caso ocorra algum erro na abertura do arquivo
        system ("pause");
        exit(1);
    }

    printf("\nDigite o codigo do produto: \n");
    setbuf(stdin,NULL);
    scanf("%[^\n]s",T[*qtd].codigo);
    fprintf(f,"%s\n",T[*qtd].codigo); //passa para o arquivo

     printf("\nDigite o nome do produto: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].nome_produto);
     fprintf(f,"%s\n",T[*qtd].nome_produto);

     printf("\nDigite o nome do fabricante: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].fabricante); //passa o valor para o endereco da struct cadastro_produto
     fprintf(f,"%s\n",T[*qtd].fabricante);

     printf("\nDigite o preco do produto: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s", &T[*qtd].preco);
     fprintf(f,"%s\n",T[*qtd].preco);

    printf("\n");
    fclose(f);
}

//2
//Funcao para o cadastro de clientes
void cadastro2(struct cadastro_cliente T[], int *qtd)
{
   FILE *f;
    f = fopen ("arquivo_cadastro_cliente.txt", "a");

    if (f==NULL)
    {
        printf("Erro na abertura do arquivo!\n");
        system ("pause");
        exit(1);
    }


    printf("\nDigite o CPF do cliente: \n");
    setbuf(stdin,NULL);
    scanf ("%s", T[*qtd].cliente_cpf);
    fprintf(f,"%s\n",T[*qtd].cliente_cpf); //passa para o arquivo

     printf("\nDigite o nome do cliente: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].nome_cliente);
     fprintf(f,"%s\n",T[*qtd].nome_cliente);

     printf("\nDigite a data de naciemento do cliente: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].data_nascimento_c); //pego o valor e passo para o endereco da struct cadastro_cliente
     fprintf(f,"%s\n",T[*qtd].data_nascimento_c);

     printf("\nDigite o CEP do cliente: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s", &T[*qtd].cep);
     fprintf(f,"%s\n",T[*qtd].cep);

    printf("\n");
    fclose(f);
}

//3
//Funcao para o cadastro de funcionarios
void cadastro3(struct cadastro_funcionario T[], int *qtd)
{
   FILE *f;
    f = fopen ("arquivo_cadastro_funcionario.txt", "a");

    if (f==NULL)
    {
        printf("Erro na abertura do arquivo!\n");
        system ("pause");
        exit(1);
    }

    printf("\nDigite o CPF do funcionario: \n");
    setbuf(stdin,NULL);
    scanf ("%s", T[*qtd].funcionario_cpf);
    fprintf(f,"%s\n",T[*qtd].funcionario_cpf); //passa para o arquivo

     printf("\nDigite o nome do funcionario: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].nome_funcionario);
     fprintf(f,"%s\n",T[*qtd].nome_funcionario);

     printf("\nDigite a data de naciemento do funcionario: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].data_nascimento_f); //pego o valor e passo para o endereco da struct cadastro_funcionario
     fprintf(f,"%s\n",T[*qtd].data_nascimento_f);

     printf("\nDigite a data de ingresso do funcionario: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s", &T[*qtd].data_ingresso);
     fprintf(f,"%s\n",T[*qtd].data_ingresso);

    printf("\n");
    fclose(f);
}

//4
//Funcao para registrar as vendas feitas por um funcionario para um cliente
void registro_de_vendas(struct vendas T[], int *qtd)
{
   FILE *f;
    f = fopen ("arquivo_vendas.txt", "a");

    if (f==NULL)
    {
        printf("Erro na abertura do arquivo!\n");
        system ("pause");
        exit(1);
    }

    printf("\nDigite o nome do funcionario: \n");
    setbuf(stdin,NULL);
    scanf ("%[^\n]s", T[*qtd].funcionario);
    fprintf(f,"%s\n",T[*qtd].funcionario); //passa para o arquivo

     printf("\nDigite o nome do cliente: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].cliente);
     fprintf(f,"%s\n",T[*qtd].cliente);

     printf("\nDigite o codigo do protudo: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s",T[*qtd].codigo_produto); //pego o valor e passo para o endereco da struct cadastro_funcionario
     fprintf(f,"%s\n",T[*qtd].codigo_produto);

     printf("\nDigite o nome do produto: \n");
     setbuf(stdin,NULL);
     scanf("%[^\n]s", &T[*qtd].n_produto);
     fprintf(f,"%s\n",T[*qtd].n_produto);

    printf("\n");
    fclose(f);
}

//5
//Funcao que mostra  o produto mais vendido (Não implementada)


//6
//Funcao que mostra o cliente que mais gastou (Não implementada)


//7
//Funcao extra que mostra quantos clientes foram cadastrados
void quantos_clientes_cadastrados (struct cadastro_cliente T[])
{
   FILE *f;
    int i=0,tam=0;
    char ch[100],c;

    f=fopen("arquivo_cadastro_cliente.txt","r"); // leitura do arquivo já existente

    if (f==NULL)
    {
        printf("Erro na abertura do arquivo!\n");
        system ("pause");
        exit(1);
    }


    while (1)
    {
        fgets(ch, 100, f);
        if (feof(f)) //se acabar o arquivo, break
            break;
        i++;
    }
    fclose(f);
    tam=i/4; //4 e a qtd de dados q tem na struct ( 1 por linha)
    printf("Quantidade de clientes cadastrados: %d",tam);
    printf("\n");

}


void menu()
{
    int opcao;
    struct cadastro_funcionario F[30];
    struct cadatro_produto P[30];
    struct cadastro_cliente C[30];
    struct vendas V[30];
    int qtd=0;

    while(1)
    {
        printf("\n1- Cadastrar Produto ");
        printf("\n2- Cadastrar Cliente");
        printf("\n3- Cadastrar Funcionario");
        printf("\n4- Registrar Venda");
        //printf("\n5- Mostrar produto mais vendido");
        //printf("\n6- Mostrar cliente que mais gastou");
        printf("\n7- Mostrar quantidade de clientes cadastrados");
        printf("\n8- Sair ");
        printf("\nDigite a opcao: ");
        scanf("%d", &opcao);
        printf("\n");

        if(opcao == 1) cadastro1(P,&qtd);
        if(opcao == 2) cadastro2(C,&qtd);
        if(opcao == 3) cadastro3(F,&qtd);
        if(opcao == 4) registro_de_vendas(V,&qtd);
        //if(opcao == 5) mostra_produto_mais_vendido(P);
       //if(opcao == 6) mostra_cliente_mais_gastou(C);
        if(opcao == 7) quantos_clientes_cadastrados(C);
        if(opcao == 8) return;
    }
}


int main()
{
    menu();
}
