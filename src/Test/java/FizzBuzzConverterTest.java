import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzConverterTest {
    private FizzBuzzConverter fizzBuzzConverter;

    @Before
    public void setup(){
         fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void whenNotMultipleOf3or5ReturnNumber(){
        Assert.assertEquals("1", fizzBuzzConverter.stringOf(1));
        Assert.assertEquals("4", fizzBuzzConverter.stringOf(4));
        Assert.assertEquals("7", fizzBuzzConverter.stringOf(7));
    }

    @Test
    public void whenMultipleOf3ReturnFizz(){
        Assert.assertEquals("Fizz", fizzBuzzConverter.stringOf(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.stringOf(12));
        Assert.assertEquals("Fizz", fizzBuzzConverter.stringOf(99));
    }

    @Test
    public void whenMultipleOf5ReturnBuzz(){
        Assert.assertEquals("Buzz", fizzBuzzConverter.stringOf(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.stringOf(10));
        Assert.assertEquals("Buzz", fizzBuzzConverter.stringOf(50));
    }

    @Test
    public void whenMultipleOf15ReturnFizzBuzz(){
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.stringOf(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.stringOf(30));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.stringOf(60));
    }

    @Test(expected=IllegalArgumentException.class)
    public void whenNumberLessThan0ThrowException(){
        fizzBuzzConverter.stringOf(120);
        fizzBuzzConverter.stringOf(-7);
    }
}
