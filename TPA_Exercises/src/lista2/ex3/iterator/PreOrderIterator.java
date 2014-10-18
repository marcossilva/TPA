/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex3.iterator;

import lista2.ex3.No;

/**
 *
 * @author marcos
 */
public class PreOrderIterator extends OrderIterator{

    public PreOrderIterator(No raiz) {
        super(raiz);
    }

    @Override
    void setOrder(No raiz) {
        while (raiz != null){
            l.add(raiz);
            setOrder(raiz.getLeft());            
            setOrder(raiz.getRight());
        }
    }
    
}
