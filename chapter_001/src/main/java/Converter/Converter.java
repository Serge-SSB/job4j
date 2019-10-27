package ru.job4j.Calculator;

public class Converter {
    public static float rubleToEuro(float value){

        return value / 70;
    }
    public static float rubleToDollar(float value) {

        return value / 60;
    }
    public static float dollarToRuble(float value) {

        return value * 60;
    }
    public static float euroToRuble(float value){

        return value *70;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(140);
        float rubleDollar = dollarToRuble(23);
        float rubleEuro = euroToRuble(12.4f);
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        float in2 = 140;
        float expected2 = 2.3333333f;
        float out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        float in3 = 23;
        float expected3 = 1380;
        float out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        float in4 = 12.4f;
        float expected4 = 868;
        float out4 = euroToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2.3333333. Test result : " + passed2);
        System.out.println("23 dollars are 1380. Test result : " + passed3);
        System.out.println("12.4 euro are 868. Test result : " + passed4);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("23 dollars are " + rubleDollar + " ruble.");
        System.out.println("12.4 euro are " + rubleEuro + " ruble.");
    }
}
