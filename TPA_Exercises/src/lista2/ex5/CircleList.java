package lista2.ex5;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementação de Lista Circular
 *
 * @author Marcos
 * @param <E>
 */
public class CircleList<E> extends AbstractList<E> {

    private final List<E> a;

    public CircleList() {
        a = new LinkedList<>();
    }

    @Override
    public E remove(int index) {
        return a.remove(index);
    }

    @Override
    public void add(int index, E element) {
        a.add(index, element);
    }

    @Override
    public E get(int index) {
        /**
         * Como a lista é circular as posições seguem a função modular dada pelo
         * número de elementos da lista.
         */
        return a.get(Math.abs(index % this.size()));
    }

    @Override
    public int size() {
        return a.size();
    }

}
