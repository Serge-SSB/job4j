package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result2 = distance(30, 5, 3, -7);
        double result3 = distance(8, 0, -203, -12);

        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (30, 5) to (3, -7) " + result2);
        System.out.println("result (8, 0) to (-203, -12) " + result3);
    }
}
