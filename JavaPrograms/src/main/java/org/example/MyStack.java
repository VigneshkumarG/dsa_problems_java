package org.example;

public class MyStack implements StackInterface {

    private int arr[];
    private int size;
    private int top;

    MyStack(int size) {
        this.top = - 1;
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int a){
        top++;
        arr[top] = a;
    }

    public int pop() {
        if (top == -1){
            return  -1;
        }
        int element = arr[top];
        top--;
        return element;
    }

    public int top(){
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return  top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
