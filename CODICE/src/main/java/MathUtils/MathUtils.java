package MathUtils;

public class MathUtils {
    /**
     * Calculates the factorial of a given number.
     *
     * @param n the number
     * @return the factorial of the number
     * @throws IllegalArgumentException if the number is negative
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero non può essere negativo");
        }
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

