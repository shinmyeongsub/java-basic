package oop1.ex;

public class Rectangle {
    int width = 0;
    int height = 0;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
