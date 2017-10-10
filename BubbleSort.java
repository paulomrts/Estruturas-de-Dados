/** 
Estruturas de Dados 2 - Engenharia de Computação 
Im'plementação do Método de Ordenação do Bubble Sort Melhorado (usando a variável booleana)

- Váriavel Booleana: swap 
- Input:  { 10, 100, 85, 99, 500, 21, 12, 90, 26, 89 };
- Output:

paulo@paulo:~/Documents/EngComp_Disciplinas/Disciplinas 2016 - 2/Estruturas de Dados 2/Atividade 3$ java BubbleSort BubbleSort.class 
Valores ordenados: 
10 12 21 26 85 89 90 99 100 500

*/


public class BubbleSort {
 
    static void bubblesort(Integer[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
 
            boolean swap= true;
            for (int j = 0; j < valores.length - 1; j++) {
                if (valores[j].intValue() > valores[j + 1].intValue()) {
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                    swap= false;
                }
            }
            if (swap) {
                break;
            }
        }
    }
 
    public static void main(String[] args) {
        Integer[] valores = { 10, 100, 85, 99, 500, 21, 12, 90, 26, 89 };
        bubblesort(valores);
        System.out.println("Valores ordenados: ");
        for (Integer value : valores) {
            System.out.print(value + " ");
        }
    }
}