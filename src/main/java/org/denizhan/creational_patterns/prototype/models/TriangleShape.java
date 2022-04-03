package org.denizhan.creational_patterns.prototype.models;

public class TriangleShape extends Shape{

    public TriangleShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public TriangleShape cloneShape() {
        return new TriangleShape(this.width, this.height);
    }
}
