package com.josepolive.polygonunprojection.util;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Point3D;

public class TransformationUtil {

    public static Point3D transformPoint(Point2D point2D, double slopeDegrees, double azimuthDegrees) {

        //We convert degrees to radians for mathematical operations
        double slopeRadians = Math.toRadians(slopeDegrees);
        double azimuthRadians = Math.toRadians(azimuthDegrees);

        double z = point2D.getY() * Math.tan(slopeRadians);

        double x = (point2D.getX() * Math.cos(azimuthRadians)) - (point2D.getY() * Math.sin(azimuthRadians));
        double y = (point2D.getX() * Math.sin(azimuthRadians)) + (point2D.getY() * Math.cos(azimuthRadians));

        return new Point3D(x, y, z);
    }
}
