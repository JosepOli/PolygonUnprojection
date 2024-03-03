package com.josepolive.polygonunprojection.test.util;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Point3D;
import com.josepolive.polygonunprojection.util.TransformationUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransformationUtilTest {

    @Test
    public void testTransformPoint() {

        // Setup
        Point2D point2D = new Point2D(100, 50);
        double slopeDegrees = 45;
        double azimuthDegrees = 270; // West

        Point3D expectedPoint3D = new Point3D(50.0, -100.0, 50.0);

        // Execute
        Point3D resultPoint3D = TransformationUtil.transformPoint(point2D, slopeDegrees, azimuthDegrees);

        // Validate
        assertNotNull(resultPoint3D, "Resulting Point3D should not be null.");
        assertAll("Transformed Point3D Coordinates",
                () -> assertEquals(expectedPoint3D.getX(), resultPoint3D.getX(), 0.001, "X coordinate should match expected value."),
                () -> assertEquals(expectedPoint3D.getY(), resultPoint3D.getY(), 0.001, "Y coordinate should match expected value."),
                () -> assertEquals(expectedPoint3D.getZ(), resultPoint3D.getZ(), 0.001, "Z coordinate should match expected value.")
        );
    }
}
