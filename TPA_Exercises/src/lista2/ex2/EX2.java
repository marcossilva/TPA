/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class EX2 {

    public static void main(String[] args) {
        EX2 teste = new EX2();
        List<String> t = new LinkedList<>();
        t.add("8");
        t.add("1");
        t.add("3");
        System.out.println("Antes:");
        for (String a : t) {
            System.out.print(a + " ");
        }
        t = teste.sort(t);
        System.out.println("\nDepois:");
        for (String a : t) {
            System.out.print(a + " ");
        }

    }

    public List sort(List<? extends Comparable> l) {
        if (l.size() <= 1) {
            //Se a lista tem um elemento já está organizada
            return l;
        } else {
            //Se a lista tem mais de um elemento
            //Organiza com Merge Sort
            //Divide a lista em duas novas listas
            List l_1 = new ArrayList(), l_2 = new ArrayList();
            //Copia os elementos da primeira metade em l_1
            for (int i = 0; i < (l.size() / 2); i++) {
                l_1.add(l.get(i));
            }
            //Copia os elementos da segunda metade em l_2
            for (int i = (l.size() / 2); i < l.size(); i++) {
                l_2.add(l.get(i));
            }
            //Organiza a primeira metade recursivamente
            l_1 = sort(l_1);
            //Organiza a segunda metade recursivamente
            l_2 = sort(l_2);
            //Retorna o merge das duas listas organizadas parcialmente
            return merge(l_1, l_2);
        }
    }

    private List merge(List<? extends Comparable> l_1, List<? extends Comparable> l_2) {
        //Cria uma lista resultado para ser o retorno
        List result = new ArrayList();
        //Comparable é o elemento presente na lista
        Comparable left = null, right = null;
        int i = 0, j = 0;
        //Enquanto houver elementos em ao menos uma das listas
        while (i < l_1.size() || j < l_2.size()) {
            if (i < l_1.size() && j < l_2.size()) {
                //Toma um elemento de cada lado se não houver elemento instanciado
                left = l_1.get(i++);
                right = l_2.get(j++);
                int res = left.compareTo(right);
                if (res == 0) {
                    //Elementos iguais - Insere ambos na lista
                    result.add(left);
                    result.add(right);
                    //i e j se mantem pois ambas as listas foram consumidas
                } else if (res < 0) {
                    //Remove só da esquerda
                    result.add(left);
                    //Retorna a posição de consumo de j pois n foi consumido
                    j--;
                } else {
                    //Remove só da direita
                    result.add(right);
                    //Retorna a posição de consumo de i pois n foi consumido
                    i--;
                }
            } else if (i < l_1.size()) {
                result.add(l_1.get(i++));
            } else if (j < l_2.size()) {
                result.add(l_2.get(j++));
            }
        }
        return result;
    }
}
