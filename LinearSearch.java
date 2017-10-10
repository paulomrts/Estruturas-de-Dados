/*
Estruturas de Dados 2 - Engenharia de Computação 

Implementação dos Método de Pesquisa LinearS

*/

import java.util.Scanner;
 
class LinearSearch 
{
  public static void main(String args[])
  {
    int i, n, search, vet[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Numero de valores do vetor:");
    n = in.nextInt(); 
    vet = new int[n];
 	
 	System.out.println("Informe os " + n + " valores:");

    for (i = 0; i < n; i++)
      vet[i] = in.nextInt();
 
    System.out.println("Valor para busca:");
    search = in.nextInt();
 
    for (i = 0; i < n; i++)
    {
      if (vet[i] == search)     
      {
         System.out.println(search + " ocupa a posição:\n" + (i + 1));
          break;
      }
   }
   if (i == n) 
      System.out.println("Valor: " + search + " não encontrado!!");
  }
}

/*

Valores testados: 

Numero de valores do vetor:
2
Informe os 2 valores:
0
0
Valor para busca:
2
Valor: 2 não encontrado!!

Numero de valores do vetor:
2
Informe os 2 valores:
3
5
Valor para busca:
3
3 ocupa a posição:
1

*/