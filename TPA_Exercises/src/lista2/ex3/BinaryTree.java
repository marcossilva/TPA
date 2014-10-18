/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex3;

import java.util.Iterator;
import lista2.ex3.iterator.InOrderIterator;

public class BinaryTree {

    public No root;

    public BinaryTree(No root) {
        this.root = root;
    }

    public void add(No novo) {
        this.root.add(novo);
    }

    public Iterator getOrder() {
        return new InOrderIterator(root);
    }

}
