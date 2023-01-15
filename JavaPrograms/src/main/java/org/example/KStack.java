package org.example;

public class KStack {

    private int arr[];

    private int size;

    private int stackCount;

    private int topPointers[];

    private int nextPointers[];

    private int nextFreeIndex;
    private int counter[];

    void printStack(){
        System.out.println("Arr = ");
        for (int element:
             arr) {
            System.out.print(element + " , ");
        }
        System.out.println();
        System.out.println("Top = " );
        for (int element:
                topPointers) {
            System.out.print(element + " , ");
        }
        System.out.println();
        System.out.println("Next = ");
        for (int element:
                nextPointers) {
            System.out.print(element + " , ");
        }
        System.out.println();
        System.out.println("Free next = " + nextFreeIndex);
    }

    KStack(int size, int stackCount){
        this.size = size;
        this.stackCount = stackCount;
        this.arr = new int[size];
        this.topPointers = new int[stackCount];
        this.nextPointers = new int[size];
        this.counter = new int[size];

        // init top indexes to -1
        for (int i = 0; i < stackCount; i++) {
            topPointers[i] = -1;
        }
        // init counters to 0
        for (int i = 0; i < stackCount; i++) {
            counter[i] = 0 ;
        }
        // init next pointers to next indexes
        for (int i = 0; i < size-1; i++) {
            nextPointers[i] = i+1;
        }
        nextPointers[size-1] = -1;
        nextFreeIndex = 0 ;
    }

    void push(int x, int stackNumber) {
        int arrIndex = nextFreeIndex;
        nextFreeIndex = nextPointers[arrIndex];
        nextPointers[arrIndex] = topPointers[stackNumber];
        topPointers[stackNumber] = arrIndex;
        arr[arrIndex] = x;
        counter[stackNumber] ++;
    }

    int pop(int stackNumber){
        int topIndex = topPointers[stackNumber];
        topPointers[stackNumber] = nextPointers[topIndex];
        nextPointers[topIndex] = -1;
        nextFreeIndex = topIndex;
        counter[stackNumber] --;
        return arr[topIndex];
    }

    int peek(int stackNumber){
        int topIndex = topPointers[stackNumber];
        return arr[topIndex];
    }

    boolean isEmpty(int stackNumber){
        int topIndex = topPointers[stackNumber];
        return topIndex == -1;
    }

    int size(int stackNumber){
        return counter[stackNumber];
    }
}
