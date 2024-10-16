package org.factoriaf5.fizzbuzzgame;

public class FizzBuzzMetodos {
    public String fizzBuzz(int numero) {

        if ((numero % 3 == 0 && numero % 5 == 0)) {
            return "FizzBuzz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(numero);
    }

    public String fizzBuzzEtapa2(int numero) {

        if (esFizzBuzz(numero)) {
            return "FizzBuzz";
        } else if (esBuzz(numero)) {
            return "Buzz";
        } else if (esFizz(numero)) {
            return "Fizz";
        }
        return Integer.toString(numero);
    }

    public boolean esFizz(int numero) {
        return (numero % 3 == 0 || Integer.toString(numero).contains("3"));
    }

    public boolean esBuzz(int numero) {
        return (numero % 5 == 0 || Integer.toString(numero).contains("5"));
    }

    public boolean esFizzBuzz(int numero) {
        return esFizz(numero) && esBuzz(numero);
    }

    public static void main(String[] args) {
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();

        for (int i = 1; i <= 305; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }

        for (int i = 1; i <= 305; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }
    }
}
