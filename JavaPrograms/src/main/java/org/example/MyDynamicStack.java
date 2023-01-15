package org.example;

import java.util.ArrayList;

class StackEmptyException extends  Exception {

}

public class MyDynamicStack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void push(T a) {
        list.add(a);
    }

    public T pop() throws StackEmptyException {
        if (list.isEmpty()) {
            throw new StackEmptyException();
        }
        return list.remove(list.size() - 1);
    }

    public T top() throws StackEmptyException{
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
