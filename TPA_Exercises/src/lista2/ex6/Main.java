/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex6;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Marcos
 */
public class Main {
    public static void main(String[] args) {
        Integer[] num = new Integer[5];
        
        num[0] = 5;
        num[1] = 1;
        num[2] = 4;
        num[3] = 0;
        num[4] = 9;
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer)o1).compareTo((Integer)o2);
            }
        };
        Heap h = new Heap(num, c);
        for (Iterator iterator = h.iterator(); iterator.hasNext();) {
            Integer next = (Integer) iterator.next();
            System.out.println(next);           
        }
        
    }
}
