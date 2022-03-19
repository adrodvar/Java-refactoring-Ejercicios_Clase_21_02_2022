package com.example.lambdas.custom.calculator;

public class Main {

    public static void main(String[] args) {

        // opción 1: clase anónima

        Calculator sum = new Calculator() {
            @Override
            public int calculate(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = sum.calculate(10, 5);
        int result2 = sum.calculate(20, 5);
        int result3 = sum.calculate(30, 5);

        Calculator product = new Calculator() {
            @Override
            public int calculate(int num1, int num2) {
                return num1 * num2;
            }
        };

        int resul4 = product.calculate(10, 5);
        int result5 = product.calculate(20, 5);


        // opción 2: lambdas
        Calculator sum2 = (num1, num2) -> num1 + num2;
        Calculator product2 = (num1, num2) -> num1 * num2;

        int result6 = sum2.calculate(10, 5);
        int result7 = sum2.calculate(20, 5);
        int resul8 = product2.calculate(10, 5);
        int result9 = product2.calculate(20, 5);

    }
}
