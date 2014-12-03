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
public class InOrderIterator extends OrderIterator{

    public InOrderIterator(No raiz) {
        super(raiz);
    }

    @Override
    void setOrder(No raiz) {
        while (raiz != null){
            setOrder(raiz.getLeft());
            l.add(raiz);
            setOrder(raiz.getRight());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
