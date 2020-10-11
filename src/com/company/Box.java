package com.company;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double avail;

    public Box(double avail) {
        super(avail);
        this.avail = avail;
    }

    public boolean add(Shape shape) {
        if (avail >= shape.getVolume()) {
            shapes.add(shape);
            avail -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
