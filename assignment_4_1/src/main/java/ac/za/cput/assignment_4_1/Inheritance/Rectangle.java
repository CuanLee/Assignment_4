package ac.za.cput.assignment_4_1.Inheritance;

import ac.za.cput.assignment_4_1.Inheritance.Shape;

/**
 * Created by Cuan on 3/23/2016.
 */
public class Rectangle implements Shape{
    public double length;
    public double width;
    public double height;


    public Rectangle() {
    }

    public Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}
