package com.josepolive.polygonunprojection.test.transformer;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Point3D;
import com.josepolive.polygonunprojection.model.Polygon;
import com.josepolive.polygonunprojection.model.Polygon3D;
import com.josepolive.polygonunprojection.transformer.PolygonTransformer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolygonTransformerTest {

    @Test
    public void testTransform() {
        // Setup
        Polygon polygon = new Polygon();
        polygon.addVertex(new Point2D(0, 0));
        polygon.addVertex(new Point2D(100, 0));
        polygon.addVertex(new Point2D(100, 50));
        polygon.addVertex(new Point2D(0, 50));

        double slopeDegrees = 45;
        double azimuthDegrees = 270; // West, meaning elevation will occur along the x-axis from West to East

        // Execute
        PolygonTransformer transformer = new PolygonTransformer();
        Polygon3D transformedPolygon = transformer.transform(polygon, slopeDegrees, azimuthDegrees);

        // Validate
        assertNotNull(transformedPolygon, "Transformed polygon should not be null.");
        assertEquals(4, transformedPolygon.getVertices().size(), "Transformed polygon should have 4 vertices.");

        // Expected vertices after transformation
        assertPoint3DEquals(new Point3D(0, 0, 0), transformedPolygon.getVertices().get(0));
        assertPoint3DEquals(new Point3D(100, 0, 100), transformedPolygon.getVertices().get(1));
        assertPoint3DEquals(new Point3D(100, 50, 100), transformedPolygon.getVertices().get(2));
        assertPoint3DEquals(new Point3D(0, 50, 0), transformedPolygon.getVertices().get(3));
    }

    private void assertPoint3DEquals(Point3D expected, Point3D actual) {
        assertEquals(expected.getX(), actual.getX(), "X coordinate should match expected value.");
        assertEquals(expected.getY(), actual.getY(), "Y coordinate should match expected value.");
        assertEquals(expected.getZ(), actual.getZ(), "Z coordinate should match expected value.");
    }
}

