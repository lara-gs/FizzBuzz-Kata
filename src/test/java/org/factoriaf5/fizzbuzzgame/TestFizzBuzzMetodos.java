package org.factoriaf5.fizzbuzzgame;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFizzBuzzMetodos {
    @Test
    public void testFizz() {
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz",resultado);
    }

    @Test
    public void testBuzz(){
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", resultado);
    }

    @Test
    public void testFizzBuzz(){
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testNumeroNoFizzBuzz(){
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(4);
        assertEquals("4", resultado);
    }

    @Test
    public void testContiene3(){
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(23);
        assertEquals("23", resultado);
    }

    @Test
    public void testContiene5(){
        FizzBuzzMetodos fizzBuzz = new FizzBuzzMetodos();
        String resultado = fizzBuzz.fizzBuzz(58);
        assertEquals("58", resultado);
    }
}

