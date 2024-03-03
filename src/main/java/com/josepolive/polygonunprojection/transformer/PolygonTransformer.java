package com.josepolive.polygonunprojection.transformer;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Polygon;
import com.josepolive.polygonunprojection.model.Polygon3D;
import com.josepolive.polygonunprojection.util.TransformationUtil;

public class PolygonTransformer {

    public Polygon3D transform(Polygon polygon, double slopeDegrees, double azimuthDegrees) {
        Polygon3D polygon3D = new Polygon3D();

        for (Point2D vertex : polygon.getVertices()) {
            polygon3D.addVertex(TransformationUtil.transformPoint(vertex, slopeDegrees, azimuthDegrees));
        }
        return polygon3D;
    }
}
