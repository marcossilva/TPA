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
public class WidthIterator extends OrderIterator {

    public WidthIterator(No raiz) {
        super(raiz);
    }

    @Override
    void setOrder(No raiz) {
        if (raiz != null) {
            l.add(raiz);
            if (raiz.getLeft() != null) {
                l.add(raiz.getLeft());
            }
            if (raiz.getRight() != null) {
                l.add(raiz.getRight());
            }
            setOrder(raiz.getLeft());
            setOrder(raiz.getRight());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
