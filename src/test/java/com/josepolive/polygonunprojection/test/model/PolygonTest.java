package com.josepolive.polygonunprojection.test.model;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Polygon;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PolygonTest {

    @Test
    public void testAddVertexAndVerticesGetter(){
        Polygon polygon = new Polygon();
        polygon.addVertex(new Point2D(0,0));
        polygon.addVertex(new Point2D(1,0));
        polygon.addVertex(new Point2D(1,1));
        polygon.addVertex(new Point2D(0,1));

        assertEquals(4, polygon.getVertices().size(), "Polygon should have 4 vertices after adding 4 points");
        assertAll("Vertices Coordinates",
                () -> assertEquals(new Point2D(0, 0), polygon.getVertices().get(0), "First vertex should be at (0,0)"),
                () -> assertEquals(new Point2D(1, 0), polygon.getVertices().get(1), "Second vertex should be at (1,0)"),
                () -> assertEquals(new Point2D(1, 1), polygon.getVertices().get(2), "Third vertex should be at (1,1)"),
                () -> assertEquals(new Point2D(0, 1), polygon.getVertices().get(3), "Fourth vertex should be at (0,1)")                );
    };
}
