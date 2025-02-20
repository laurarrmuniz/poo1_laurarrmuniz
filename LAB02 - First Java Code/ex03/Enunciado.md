#Exercício 03

Para os próximos exercícios crie uma classe chamada **Ponto**, que armazena dois
números reais que representam coordenadas cartesianas. Crie os métodos indicados
abaixo e faça um programa principal que chame todos esses métodos

- Faça um método chamado imprime_ponto, que mostra na tela o ponto no seguinte formato (ponto.x, ponto.y)

````{verbatim}
Exemplo de Saída:
Digite o valor de x: 10
Digite o valor de y: 5
O ponto digitado é: (10,5)
````
- Faca um método que some dois pontos. Mostre os 3 pontos usando o método imprime_ponto.

````{verbatim}
Exemplo de saída:
Digite o valor de x1: 1
Digite o valor de y1: 2
Digite o valor de x2: 3
Digite o valor de y2: 4
A soma de (1,2) com (3,4) é (4,6)
````
- Crie um procedimento idêntico ao exercício anterior, mas que agora retorne void e coloque o resultado
da soma no terceiro argumento da função (usar método estático).
````{verbatim}
Exemplo de saída:
Digite o valor de x1: 1
Digite o valor de y1: 2
Digite o valor de x2: 3
Digite o valor de y2: 4
A soma de (1,2) com (3,4) é (4,6)
````

- Faça um método estático que calcule a área do retângulo definido por dois pontos. Faça testes para valores inválidos.
Cabeçalho: area = Ponto.calc_area(p1,p2)

````{verbatim}
Exemplo de saída:
A área do retângulo definido por (1,4) e (4,2) é 6
````

- Faça um método que multiplique o valor de um ponto por uma constante e altere o valor do ponto. 

````{verbatim}
Exemplo de saída:
Digite o ponto: 1,2
Digite a constante: 5
Resultado: (1,2) * 5 = (5,10)
````

- Faça um procedimento chamado inc_dir, que faz o ponto andar uma unidade para leste, oeste, norte, sul


````{verbatim}
p.inc_dir(’l’); // anda uma unidade para o leste (incrementa x)
p.inc_dir(’o’); // anda uma unidade para o oeste (decrementa x)

Exemplo de saída:
(1,3) norte => (1,4)
(2,4) leste => (3,4)
````

- Crie um procedimento para andar na diagonal (sudeste, sudoeste, nordeste, noroeste). 
Use obrigatoriamente as funções do exercício anterior.

````{verbatim}
p.ind_diag("sudeste”); 
p.ind_diag(”sudoeste”);

Exemplo de saída:
(1,3) sudeste => (2,2)
(2,4) sudoeste => (1,3)
````

- Crie um programa que usa a classe Ponto e que cria um array de pontos. 
Peça para o usuário indicar quantos pontos deseja cadastrar. Cadastre os pontos.
Ao final, mostrar qual o ponto que está mais à direita, à esquerda, mais acima e mais abaixo.
