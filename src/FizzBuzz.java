public class FizzBuzz {
    public String result(int input) {
        if (input % 3 == 0){
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);

    }
}

