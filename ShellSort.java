/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsort;

/**
 *
 * @author paulo
 */

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
