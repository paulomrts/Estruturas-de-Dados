/*
Estruturas de Dados 2 - Engenharia de Computação 

Implementação dos Método de Pesquisa Binária - Recursiva

*/

class RecursiveBinary
{
    int binarySearch(int vet[], int left, int right, int x)
    {
        if (right>=left)
        {
            int middle = left + (right - left)/2;

            if (vet[middle] == x)
               return middle;

            if (vet[middle] > x)
               return binarySearch(vet, left, middle-1, x);
               return binarySearch(vet, middle+1, right, x);
        }
 
        
        return -1;
    }
 
    // Para o teste foi utilizado os mesmo valores do último teste em BinarySearch

    public static void main(String args[])
    {
        RecursiveBinary teste = new RecursiveBinary();
        int vet[] = {4,3,2,1,5};
        int n = vet.length;
        int x = 5;
        int result = teste.binarySearch(vet,0,n-1,x);
        if (result == -1)
            System.out.println("Valor nao econtrado");
        else
            System.out.println("Valor ocupa a posicao:  "+result);
    }
}
