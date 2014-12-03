/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author marcos
 * @param <T>
 */
public class Heap<T> {
    private T[] a;
    private Comparator comp;
    public Heap(T[] a, Comparator comp){
        this.a = a;
        this.comp = comp;
        heapSort(a);
    }
    private <T> void heapSort(T[] v) {
        buildMaxHeap(v);
        int n = v.length;
 
        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
        }
    }
 
    private <T> void buildMaxHeap(T v[]) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);
    }
 
    private <T> void maxHeapify(T[] v, int pos,
            int n) {
        int max = 2 * pos + 1, right = max + 1;
        if (max < n) {
            if (right < n && comp.compare(v[max], v[right]) < 0)
                max = right;
            if (comp.compare(v[max], v[pos]) > 0) {
                swap(v, max, pos);
                maxHeapify(v, max, n);
            }
        }
    }
 
    private void swap(Object[] v, int j, int aposJ) {
        Object aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }    
    public Iterator iterator(){
        ArrayList l = new ArrayList();
        l.addAll(Arrays.asList(a));
        return l.iterator();
    }
}
