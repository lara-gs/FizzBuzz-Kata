package org.factoriaf5.fizzbuzzgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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

    @Test
    public void testEtapa2PruebaFizz(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(3);
        assertEquals("Fizz", resultado);
    }

    @Test
    public void testEtapa2PruebaFizzContiene3(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(234);
        assertEquals("Fizz", resultado);
    }

    @Test
    public void testEtapa2PruebaBuzz(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(5);
        assertEquals("Buzz", resultado);
    }
    @Test
    public void testEtapa2PruebaBuzzContiene5(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(254);
        assertEquals("Buzz", resultado);
    }

    @Test
    public void testEtapa2PruebaFizzBuzzContiene3y5(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(355);
        assertEquals("FizzBuzz", resultado);
    }
    @Test
    public void testEtapa2PruebaFizzBUzzNoContiene3y5(){
        FizzBuzzMetodos fizzBuzzMetodos = new FizzBuzzMetodos();
        String resultado = fizzBuzzMetodos.fizzBuzzEtapa2(4);
        assertEquals("4", resultado);
    }
}

