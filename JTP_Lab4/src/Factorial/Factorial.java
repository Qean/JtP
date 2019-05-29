package Factorial;

public class Factorial {

    public static int factorial(int factorial) throws NegativeNumberException {
        if (factorial < 0) {
            throw new NegativeNumberException("Negative numbers don't have factorials!");
        }
        int factorial_sum = 1;
        for (int i = factorial; i > 0; i--) {
            factorial_sum *= i;
        }
        return factorial_sum;
    }
}