package com.globalpayex;

public class myArray <T> {
    private T[] elements;

    public myArray(T[] elements) {
        this.elements = elements;
    }
    public void set(int index, T element) {
        this.elements[index - 1] = element;

    }

    public T get(int index) {
        return this.elements[index - 1];
    }

    public void printAll() {
        for (T element : elements) {

            System.out.println(element);
        }
    }
}
