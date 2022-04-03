package org.denizhan.creational_patterns.prototype.models;

public abstract class Shape {
    protected int width;
    protected int height;
    public abstract Shape cloneShape();

    @Override
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        Shape object = (Shape) obj;
        return this.width == object.width && this.height == object.height;
    }
}
