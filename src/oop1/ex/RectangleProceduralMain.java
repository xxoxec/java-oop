package oop1.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        int width = 5;
        int heigth = 8;
        int area = calculateArea(width, heigth);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width, heigth);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, heigth);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int heigth) {
        return 2 * (width + heigth);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
