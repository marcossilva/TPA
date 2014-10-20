/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex6;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Marcos
 */
public class HeapSorterCollection {           
    public Iterator sorter(Collection c, Comparator comp) {
        Heap h = new Heap(c.toArray(), comp);
        return h.iterator();
    }             
}
