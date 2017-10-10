/*
 *  Estruturas de Dados 2 - Engenharia de Computação 
 Implementação do Método de Ordenação Shellsort, seguindo a sequência de Knuth (h=(h*3)+1).
 Imprimir o vetor para cada sequência de h-ordenado.    

**** ORDENAÇÕES TESTADAS ****

Vetor Inicial: [91, 9, 78, 55, 50, 98, 75, 11, 12, 54, 29, 61, 0, 63, 16, 8, 25, 28, 90, 34]
Vetor Ordenado:  [0, 8, 9, 11, 12, 16, 25, 28, 29, 34, 50, 54, 55, 61, 63, 75, 78, 90, 91, 98]


Vetor Inicial: [29, 59, 61, 38, 10, 60, 21, 21, 2, 98, 39, 70, 70, 18, 31, 70, 47, 43, 85, 61]
Vetor Ordenado:  [2, 10, 18, 21, 21, 29, 31, 38, 39, 43, 47, 59, 60, 61, 61, 70, 70, 70, 85, 98]

Vetor Inicial: [51, 4, 69, 89, 90, 60, 53, 14, 53, 69, 45, 38, 55, 93, 76, 1, 48, 61, 23, 10]
Vetor Ordenado:  [1, 4, 10, 14, 23, 38, 45, 48, 51, 53, 53, 55, 60, 61, 69, 69, 76, 89, 90, 93]

 */

package shellsort;
import java.util.*;

public class ShellSort{
 
  public static void shellsort(int[] vet) {
    int x, y;
    int temp;
 
    int h = 1;
    while (h <= vet.length / 3) {
      h = h * 3 + 1;
    }
    while (h > 0) {
      for (y = h; y < vet.length; y++) {
        temp = vet[y];
        x = y;
 
        while (x > h - 1 && vet[x - h] >= temp) {
          vet[x] = vet[x - h];
          x -= h;
        }
        vet[x] = temp;
      }
      h = (h - 1) / 3;
    }
  }
}


  public static void main(String[] args) {
      
   int vet[] = new int[20];

    for(int i=0; i<vet.length;i++)
        
    vet[i] =(int)(java.lang.Math.random()*99);
 
    System.out.println("Vetor Inicial: " + Arrays.toString(vet));
    shellsort(vet);

    System.out.println("Vetor Ordenado:  " + Arrays.toString(vet));
 
  }
