/*
Estruturas de Dados 2 - Engenharia de Computação 
1) Implementação do método QuickSort conforme descrição nos slides do moodle (https://ead.inf.ufg.br/mod/resource/view.php?id=31207) e no livro "Projeto de Algoritmos com implementações em Java e C++"

2) Implementação do método QuickSort conforme video apresentado em aula (https://www.youtube.com/watch?v=ywWBy6J5gz8). 

** Valores de teste *

v[10] ={10,20,30,0,25,3,40,350,999,666}

Saída obtida:

Vetor informado ordenado pelo metodo QuickSort com dois pivos: 
0 3 10 20 25 30 40 350 666 999

*/

import java.util.*;

public class DualPivotQuickSort {

	public static void main(String[] args) {
		
		int vet[] = new int[10];
		int i;

		Scanner num = new Scanner(System.in);

		for(i=0;i<=9;i++){
			System.out.println("Inserir o valor "+(i+1)+" do vetor: ");
			vet[i] = num.nextInt();

		}

		quicksort(vet,0,9);

		System.out.println("Vetor informado ordenado pelo metodo QuickSort com dois pivos: ");

			for(int value: vet){
				System.out.print(value+" \n");
			}

	}

	public static void swap(int vet[], int i, int j){

		int aux;
		aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

	public static void quicksort(int vet[] , int e, int d) {

	    if (d > e) {
	        
	        if (vet[e] > vet[d]) swap(vet, e, d);
	        int p = vet[e], q = vet[d];
	        
	        int l = e + 1, g = d - 1, k = l;
	        while (k <= g) {
	            if (vet[k] < p) {
	                swap(vet, k, l);
	                ++l;
	            } else if (vet[k] >= q) {
	                while (vet[g] > q && k < g) --g;
	                swap(vet, k, g);
	                --g;
	                if (vet[k] < p) {
	                    swap(vet, k, l);
	                    ++l;
	                }
	            }
	            ++k;
	        }
	        --l; ++g;

	        
	        swap(vet, e, l); swap(vet, d, g);

	        
	        quicksort(vet, e, l - 1);
	        quicksort(vet, l + 1, g - 1);
	        quicksort(vet, g + 1, d);
	    }
	}
}




