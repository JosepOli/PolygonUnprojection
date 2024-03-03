package com.josepolive.polygonunprojection.model;

import java.util.ArrayList;
import java.util.List;

public class Polygon3D {

    private List<Point3D> vertices;

    public Polygon3D(){
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Point3D vertex){
        vertices.add(vertex);
    }
    public List<Point3D> getVertices(){
        return vertices;
    }
}
