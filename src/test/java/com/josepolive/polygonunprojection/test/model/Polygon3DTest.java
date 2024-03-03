package com.josepolive.polygonunprojection.test.model;

import com.josepolive.polygonunprojection.model.Point3D;
import com.josepolive.polygonunprojection.model.Polygon3D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Polygon3DTest {

    @Test
    public void testAddVertexAndVerticesGetter() {
        Polygon3D polygon = new Polygon3D();
        polygon.addVertex(new Point3D(0,0,0));
        polygon.addVertex(new Point3D(1,0,0));
        polygon.addVertex(new Point3D(1,1,0));
        polygon.addVertex(new Point3D(0,1,0));

        assertEquals(4, polygon.getVertices().size(), "Polygon3D should have 4 vertices after adding 4 points");
        assertAll("Vertices Coordinates",
                () -> assertEquals(new Point3D(0, 0, 0), polygon.getVertices().get(0), "First vertex should be at (0,0,0)"),
                () -> assertEquals(new Point3D(1, 0, 0), polygon.getVertices().get(1), "Second vertex should be at (1,0,0)"),
                () -> assertEquals(new Point3D(1, 1, 0), polygon.getVertices().get(2), "Third vertex should be at (1,1,0)"),
                () -> assertEquals(new Point3D(0, 1, 0), polygon.getVertices().get(3), "Fourth vertex should be at (0,1,0)")
        );
    }
}
