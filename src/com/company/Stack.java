package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.04.2016.
 */
public class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements to Stack");
        int element = scanner.nextInt();
        stackArray[++top] = element;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }
}
