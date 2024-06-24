package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;

public class Reactangle extends Shape {
     private int length;
     private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Reactangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public int perimeter(){
        return 2*(this.length+this.breadth);
    }
    public int area(){
        return this.length*this.breadth;
    }
}
