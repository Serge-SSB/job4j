package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (( k / 2) + (k / 2) + k + k);    // p = 1x+1x+2x+2x
        double l = h * k;
        System.out.println(h); //высота
        System.out.println(l); //длина
        double s = l * h;
        double x =2 * (l + h);
        System.out.println(x); //периметр
        return s;

    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        double result2 = square(40,2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);

    }
}
