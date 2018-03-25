import java.util.stream.IntStream;

public class FizzBuzzConverter {

    public static void main(String[] args) {
        IntStream.range(1,100).mapToObj(n-> n % 15 == 0 ? "FizzBuzz"
                : n % 3 == 0 ? "Fizz"
                : n % 5 == 0 ? "Buzz"
                : Long.valueOf(n))
                .forEach(System.out::println);
    }

    public String stringOf(int num) {

        throwExceptionIfNumberIsOutOfRange(num);

        return isDivisibleBy3(num) && isDivisibleBy5(num) ? "FizzBuzz"
                : isDivisibleBy5(num) ? "Buzz"
                : isDivisibleBy3(num) ? "Fizz"
                : String.valueOf(num);
    }

    private boolean isDivisibleBy5(int number){
        return number % 5 == 0;
    }

    private boolean isDivisibleBy3(int number){
        return number % 3 == 0;
    }

    private void throwExceptionIfNumberIsOutOfRange(int number) {

        if(number < 0 || number > 100) {
            throw new IllegalArgumentException(number+ " must be between 1-100");
        }
    }


}
