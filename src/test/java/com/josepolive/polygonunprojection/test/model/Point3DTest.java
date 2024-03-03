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
    public void testPoint3DSetter(){
        Point3D point = new Point3D(1.0, 2.0, 3.0);
        point.setZ(4.0);
        assertEquals(4.0, point.getZ(), "Z coordinate should be 4.0 after setZ");
    }
}
