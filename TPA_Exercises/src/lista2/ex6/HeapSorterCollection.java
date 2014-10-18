/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class HeapSorterCollection {
    private final Collection c;
    private final List l;
    private Comparator comp;
    public HeapSorterCollection(Collection<? super Comparable> c) {
        this.c = c;
        l = new ArrayList(c);
        comp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                
            }
        }
    }
    
}
