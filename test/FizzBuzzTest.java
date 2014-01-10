import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldKnowThatAThreeIsAFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzBuzz.result(3);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldKnowThatANumberDivisibleByThreeIsAFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzBuzz.result(9);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldKnowThatAFiveIsABuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzBuzz.result(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldKnowThatANumberDivisibleByFiveIsAFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzBuzz.result(10);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldKnowThatANumberNotDivisibleByThreeOrFiveDoesNotChange(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "8";
        String actual = fizzBuzz.result(8);
        assertEquals(expected, actual);
    }

}
