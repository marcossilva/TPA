package lista2.ex4;

import java.util.ArrayList;
import java.util.List;

class LispList<T> {

    private List<T> array;

    private LispList(List<T> a) {
        array = a;
    }

    public boolean isEmpty() {
        return array.size() == 0;
    }

    public T car() {
        if (!isEmpty()) {
            return array.get(0);
        }
        return null;
    }

    public LispList<T> cons(T obj, T obj2) {
        List<T> a = new ArrayList<>();
        a.add(obj);
        a.add(obj2);
        return new LispList<>(a);
    }

    public LispList<T> cdr() {
        List<T> a = new ArrayList<>();
        if (!isEmpty()) {
            for (int i = 1; i < array.size(); i++) {
                a.add(array.get(i));
            }
        }
        return new LispList<>(a);
    }
}
