package GenericsSetMap.Generics.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T fist(){
        return list.get(0);
    }

    public void print(){
        System.out.println(list);
    }
}
