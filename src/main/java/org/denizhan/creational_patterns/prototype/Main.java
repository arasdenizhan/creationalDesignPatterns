package org.denizhan.creational_patterns.prototype;

import lombok.extern.slf4j.Slf4j;
import org.denizhan.creational_patterns.prototype.models.RectangleShape;
import org.denizhan.creational_patterns.prototype.models.TriangleShape;

@Slf4j
public class Main {
    public static void main(String[] args) {
        RectangleShape rectangleShape = new RectangleShape(100,150);
        TriangleShape triangleShape = new TriangleShape(125,125);

        RectangleShape anotherRectangle = rectangleShape.cloneShape();
        TriangleShape anotherTriangle = triangleShape.cloneShape();

        log.info(String.valueOf(rectangleShape.equals(anotherRectangle)));
        log.info(String.valueOf(triangleShape.equals(anotherTriangle)));
    }
}
