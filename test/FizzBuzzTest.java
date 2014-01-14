import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldKnowThatThreeIsAFizz(){
        FizzBuzz fizzBuzz =  new FizzBuzz(3);
        String actual = fizzBuzz.print();
        assertEquals("Fizz", actual);
    }

    @Test
    public void ShouldKnowThatOneIsAOne() {
        FizzBuzz fizzBuzz =  new FizzBuzz(1);
        String actual = fizzBuzz.print();
        assertEquals("1", actual);
    }

    @Test
    public void ShouldKnowThatAnyNumberNotADivisionOf3And5IsANumber() {
        FizzBuzz fizzBuzz =  new FizzBuzz(4);
        String actual = fizzBuzz.print();
        assertEquals("4", actual);
    }

    @Test
    public void ShouldKnowThatADivisionOf3IsAFizz() {
        FizzBuzz fizzBuzz =  new FizzBuzz(6);
        String actual = fizzBuzz.print();
        assertEquals("Fizz", actual);
    }

    @Test
    public void ShouldKnowThat5IsABuzz() {
        FizzBuzz fizzBuzz =  new FizzBuzz(5);
        String actual = fizzBuzz.print();
        assertEquals("Buzz", actual);
    }

    @Test
    public void ShouldKnowThatADivisionOf5IsABuzz() {
        FizzBuzz fizzBuzz =  new FizzBuzz(10);
        String actual = fizzBuzz.print();
        assertEquals("Buzz", actual);
    }

    @Test
    public void ShouldKnowThat15IsAFizzBuzz() {
        FizzBuzz fizzBuzz =  new FizzBuzz(15);
        String actual = fizzBuzz.print();
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void ShouldKnowThatADivisionOfFiveAndThreeIsAFizzBuzz() {
        FizzBuzz fizzBuzz =  new FizzBuzz(30);
        String actual = fizzBuzz.print();
        assertEquals("FizzBuzz", actual);
    }


}