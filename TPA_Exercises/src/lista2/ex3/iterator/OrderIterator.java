/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex3.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lista2.ex3.No;

/**
 *
 * @author marcos
 */
public abstract class OrderIterator implements Iterator {    
    int index;
    List<No> l;

    public OrderIterator(No raiz) {
        l = new ArrayList<>();
        setOrder(raiz);
    }

    @Override
    public boolean hasNext() {
        return index < l.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return l.get(index++);
        } else {
            throw new Error("No elements avaiable to iterate in this object");
        }        
    }

    abstract void setOrder(No raiz);

}
