/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex6;

/**
 *
 * @author marcos
 */
public class Heap {
    private static <T extends Comparable<? super T>> void heapSort(T[] v) {
        buildMaxHeap(v);
        int n = v.length;
 
        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
        }
    }
 
    private static <T extends Comparable<? super T>> void buildMaxHeap(T v[]) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);
    }
 
    private static <T extends Comparable<? super T>> void maxHeapify(T[] v, int pos,
            int n) {
        int max = 2 * pos + 1, right = max + 1;
        if (max < n) {
            if (right < n && v[max].compareTo(v[right]) < 0)
                max = right;
            if (v[max].compareTo(v[pos]) > 0) {
                swap(v, max, pos);
                maxHeapify(v, max, n);
            }
        }
    }
 
    private static void swap(Object[] v, int j, int aposJ) {
        Object aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public void add(Object h){
        
    }
}
