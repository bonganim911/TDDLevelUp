public class FizzBuzz {
    private int number;
    public FizzBuzz(int number) {
        this.number = number;
    }

    public String print() {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
