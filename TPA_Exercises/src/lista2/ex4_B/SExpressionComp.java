/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex4_B;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author marcos
 */
public class SExpressionComp extends SExpression {

    SExpression element;
    List elements;

    public SExpressionComp() {
        this.elements = new LinkedList();
    }

    public SExpressionComp(SExpression element) {
        this.element = element;
        this.elements = new LinkedList();
    }

    @Override
    public SExpression car() {
        return element;
    }

    @Override
    public List<SExpression> cdr() {
        SExpression actual = element;
        while (actual != null) {
            //Se o filho de element for composto element.car != null
            actual = element.car();
            elements.add(actual);            
        }
        return elements;
    }   

}
