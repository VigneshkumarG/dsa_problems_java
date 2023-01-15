package org.example;

public class TwoStack {
    int arr[];
    int size;
    int top1;
    int top2;

    TwoStack(){
        size = 100;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int a) {
        top1++;
        arr[top1] = a;
    }

    void push2(int a){
        top2--;
        arr[top2] = a;
    }

    int pop1(){
        if (top1 < 0){
            return -1;
        }
        int element = arr[top1];
        top1--;
        return element;
    }

    int pop2(){
        if (top2 >= size) {
            return -1;
        }
        int element = arr[top2];
        top2++;
        return element;
    }

    int size1(){
        return top1 + 1;
    }

    int size2(){
        return size - top2 ;
    }
}
