package org.denizhan.creational_patterns.prototype.models;

public class RectangleShape extends Shape{

    public RectangleShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public RectangleShape cloneShape() {
        return new RectangleShape(this.width, this.height);
    }
}
