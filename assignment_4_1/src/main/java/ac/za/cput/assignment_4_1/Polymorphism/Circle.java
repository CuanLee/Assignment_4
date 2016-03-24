package ac.za.cput.assignment_4_1.Polymorphism;

import ac.za.cput.assignment_4_1.Inheritance.Shape;

/**
 * Created by Cuan on 3/23/2016.
 */
public class Circle implements Shape{
    final double PI = 3.14;
    private double radius;
    private double height;

    public Circle() {
    }

    public Circle(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }
}

