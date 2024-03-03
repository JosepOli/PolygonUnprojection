package com.josepolive.polygonunprojection.model;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Point2D> vertices;

    public Polygon(){
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Point2D vertex){
        vertices.add(vertex);
    }
    public List<Point2D> getVertices(){
        return vertices;
    }
}
