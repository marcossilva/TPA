/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex4_B;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcos
 */
public abstract class SExpression {
    public List cons(SExpression one, SExpression two){
        List t = new ArrayList();
        t.add(one);
        t.add(two);
        return t;
    }
    public abstract SExpression car();
    public abstract List<SExpression> cdr();    
}
