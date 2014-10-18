/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex5;

import java.util.List;

/**
 *
 * @author Marcos
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> t = new CircleList<>();
        t.add(3);
        t.add(4);
        System.out.println(t.get(0));
        System.out.println(t.get(2));
        System.out.println(t.size());
        t.clear();
    }
}
