package com.josepolive.polygonunprojection.test.model;

import com.josepolive.polygonunprojection.model.Point2D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Point2DTest {

    @Test
    public void testPoint2DConstructorAndGetters() {
        Point2D point = new Point2D(1.0, 2.0);
        assertAll("Point2D Constructor and Getters",
                () -> assertEquals(1.0, point.getX(), "X coordinate should be 1.0"),
                () -> assertEquals(2.0, point.getY(), "Y coordinate should be 2.0")
        );
    }

    @Test
    public void testPoint2DSetters(){
        Point2D point = new Point2D(1.0, 2.0);
        point.setX(3.0);
        point.setY(4.0);
        assertAll("Point2D Setters",
                () -> assertEquals(3.0, point.getX(), "X coordinate should be 3.0 after setX"),
                () -> assertEquals(4.0, point.getY(), "Y coordinate should be 4.0 after setY")
                );
    }

    @Test
    public void testEquals() {
        Point2D point1 = new Point2D(1.0, 2.0);
        Point2D point2 = new Point2D(1.0, 2.0);
        Point2D point3 = new Point2D(2.0, 1.0);

        assertEquals(point1, point2, "Points with same coordinates should be equal.");
        assertNotEquals(point1, point3, "Points with different coordinates should not be equal.");
    }

    @Test
    public void testHashCode() {
        Point2D point1 = new Point2D(1.0, 2.0);
        Point2D point2 = new Point2D(1.0, 2.0);

        assertEquals(point1.hashCode(), point2.hashCode(), "Hash codes should be equal for points with same coordinates.");
    }
}