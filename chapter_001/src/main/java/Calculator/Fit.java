package ru.job4j.Calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height-100) * 1.15f;
    }


    public static double womanWeight(double height) {
        return (height-110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(1870);
        double woman = womanWeight(167);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 167 is " + woman);
    }

}