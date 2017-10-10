/*
Estruturas de Dados 2 - Engenharia de Computação 
1) Implementação do método QuickSort conforme descrição nos slides do moodle (https://ead.inf.ufg.br/mod/resource/view.php?id=31207) e no livro "Projeto de Algoritmos com implementações em Java e C++"

2) Implementação do método QuickSort conforme video apresentado em aula (https://www.youtube.com/watch?v=ywWBy6J5gz8). 

** Valores de teste *

v[10] ={10,20,30,0,25,3,40,350,999,666}

Saída obtida:

Vetor informado ordenado pelo metodo QuickSort: 
0 3 10 20 25 30 40 350 666 999

*/


import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		
		int vet[] = new int[10];
		int i;

		Scanner num = new Scanner(System.in);

		for(i=0;i<=9;i++){
			System.out.println("Inserir o valor "+(i+1)+" do vetor: ");
			vet[i] = num.nextInt();

		}

		quicksort(vet,0,9);

		System.out.println("Vetor informado ordenado pelo metodo QuickSort: ");

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

	public static int partition(int vet[], int p, int r){

		int pv, i, j;

		pv = vet[(p+r)/2];
		i = p-1;
		j = r+1;

		while(i<j){
			do 
				j-=1;	
			
			while(vet[j] > pv);
				do
					i+=1;
				
			
			while(vet[i]<pv);
				if(i<j) 
					swap(vet,i,j);
		}
		
		return j;
	}


	public static void quicksort (int vet[], int p, int r){

		int q;

		if(p<r){

			q = partition(vet,p,r);
			quicksort(vet,p,q);
			quicksort(vet,q+1,r);
		}
	}

}	




