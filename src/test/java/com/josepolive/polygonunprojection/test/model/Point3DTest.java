package com.josepolive.polygonunprojection.test.model;

import com.josepolive.polygonunprojection.model.Point3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Point3DTest {

    @Test
    public void testPoint3DConstructorAndGetters() {
        Point3D point = new Point3D(1.0, 2.0, 3.0);
        assertAll("Point3D Constructor and Getters",
                () -> assertEquals(1.0, point.getX(), "X coordinate should be 1.0"),
                () -> assertEquals(2.0, point.getY(), "Y coordinate should be 2.0"),
                () -> assertEquals(3.0, point.getZ(), "Z coordinate should be 3.0")
        );
    }

    @Test
    public void testPoint3DSetter() {
        Point3D point = new Point3D(1.0, 2.0, 3.0);
        point.setZ(4.0);
        assertEquals(4.0, point.getZ(), "Z coordinate should be 4.0 after setZ");
    }

    @Test
    public void testPoint3DEquality() {
        Point3D point1 = new Point3D(1.0, 2.0, 3.0);
        Point3D point2 = new Point3D(1.0, 2.0, 3.0);
        Point3D point3 = new Point3D(3.0, 2.0, 1.0);

        assertEquals(point1, point2, "Two points with the same coordinates should be equal.");
        assertNotEquals(point1, point3, "Two points with different coordinates should not be equal.");
    }

    @Test
    public void testPoint3DHashCode() {
        Point3D point1 = new Point3D(1.0, 2.0, 3.0);
        Point3D point2 = new Point3D(1.0, 2.0, 3.0);

        assertEquals(point1.hashCode(), point2.hashCode(), "HashCodes should be equal for two points with the same coordinates.");
    }
}
