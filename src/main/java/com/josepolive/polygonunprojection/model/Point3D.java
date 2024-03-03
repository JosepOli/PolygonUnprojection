package com.josepolive.polygonunprojection.model;

import java.util.Objects;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //As on the Point2D class, we override Java classes to perform as needed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.getX(), getX()) == 0 &&
                Double.compare(point3D.getY(), getY()) == 0 &&
                Double.compare(point3D.getZ(), z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), z);
    }

    // Override toString() for better error messages
    @Override
    public String toString() {
        return String.format("Point3D{x=%.2f, y=%.2f, z=%.2f}", getX(), getY(), z);
    }
}
