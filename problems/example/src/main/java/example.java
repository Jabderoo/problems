public class FizzBuzz {
    public static String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 )
            return ("FizzBuzz");
        else if (divisibleBy3)
            return ("Fizz");
        else if (divisibleBy5)
            return ("Buzz");

        return String.valueOf(number);
    }

    public String countTo(int number) {
        return null;
    }

    public static void main(String[] args) {
        System.out.print(checkNumber(15));
    }
}