package com.josepolive.polygonunprojection.util;

import com.josepolive.polygonunprojection.model.Point2D;
import com.josepolive.polygonunprojection.model.Point3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;

public class TransformationUtil {

    public static Point3D transformPoint(Point2D point2D, double slopeDegrees, double azimuthDegrees) {
        // Convert slope and azimuth to radians
        double slopeRadians = Math.toRadians(slopeDegrees);
        double azimuthRadians = Math.toRadians(azimuthDegrees);

        // Create initial 3D vector from the 2D point
        Vector3D point = Vector3D.of(point2D.getX(), point2D.getY(), 0);

        // For azimuth rotation, we rotate around the Z-axis
        QuaternionRotation azimuthRotation = QuaternionRotation.fromAxisAngle(Vector3D.of(0, 0, 1), azimuthRadians);

        // Apply azimuth rotation to point
        Vector3D azimuthRotatedPoint = azimuthRotation.apply(point);

        // After azimuth rotation, we apply the slope as a rotation around the Y-axis of the resulting point
        QuaternionRotation slopeRotation = QuaternionRotation.fromAxisAngle(Vector3D.of(0, 1, 0), slopeRadians);

        // Apply slope rotation
        Vector3D transformedPoint = slopeRotation.apply(azimuthRotatedPoint);

        // Return the transformed point as Point3D
        return new Point3D(transformedPoint.getX(), transformedPoint.getY(), transformedPoint.getZ());
    }
}

