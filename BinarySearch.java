/*
Estruturas de Dados 2 - Engenharia de Computação 

Implementação dos Método de Pesquisa Binária 

*/


import java.util.Scanner;
 
class BinarySearch 
{
  public static void main(String args[])
  {
    int i, first, last, middle, n, search, vet[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Numero de valores do vetor:");
    n = in.nextInt(); 
    vet = new int[n];
 
    System.out.println("Informe os " + n + " valores:");
 
    for (i = 0; i < n; i++)
      vet[i] = in.nextInt();
 
    System.out.println("Valor para busca:");
    search = in.nextInt();
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( vet[middle] < search )
        first = middle + 1;    
      else if ( vet[middle] == search ) 
      {
        System.out.println(search + " ocupa a posição:\n" + (i));
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println("Valor: " + search + " não encontrado!!");
  }
}

/*

Valores testados: 

Numero de valores do vetor:
5
Informe os 5 valores:
1
2
3
4
5
Valor para busca:
10
Valor: 10 não encontrado!!

Numero de valores do vetor:
5
Informe os 5 valores:
4
3
2
1
5
Valor para busca:
5
5 ocupa a posição:
5


*/
