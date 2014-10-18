/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex3;

/**
 *
 * @author marcos
 */
public class No {

    private Comparable value;
    private No left;
    private No right;

    public No(Comparable value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Comparable getValue() {
        return this.value;
    }

    public No getLeft() {
        return left;
    }

    public void setLeft(No left) {
        this.left = left;
    }

    public No getRight() {
        return right;
    }

    public void setRight(No right) {
        this.right = right;
    }

    public void add(No novo) {
        int res = this.getValue().compareTo(novo);
        if (res < 0) {
            //Valores menores vão para a sub-arvore à esquerda desse nó
            //Checa se existe nó
            if (this.getLeft() == null) {
                //Se não existir adiciona o nó novo
                this.setLeft(novo);
            } else {
                //Se existir faz a busca recursiva na sub-árvore à esquerda
                this.getLeft().add(novo);
            }
        } else {            
            if (this.getRight() == null) {
                this.setRight(novo);
            } else {
                this.getRight().add(novo);
            }
        }
    }
}
