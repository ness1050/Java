
public class ControlFlow {

    public static void main (String [] args) {

        int number = 11;
        ControlFlow f = new ControlFlow();

        //f.checkIfnumberIsPrim(number);
        System.out.println(f.recursion(5));
    }

    

    /**
     * Check if the number modules has a reminder of 1 or no reminder.
     * @param n paramets as number
     * @return the number
     */
    public int checkIfnumberIsPrim(int n) {

        if (n == 0) {
            return -1;
        } else {
            if (n % 2 == 0) {
                System.out.println("Is Even not Prime");
            } else {
                System.out.println("Number is prime");
                return n;
            }
        }

        return n;

    }

    /**
     * Finding facotrial of a number
     * @param n integer number
     * @return the result of factorial
     */
    public int recursion(int n) {

        if (n < 0 ) {
            throw new IllegalArgumentException("Factorial is not valid");
        }

        if (n == 0) {
            return 1;
        }

        int factorial = n * recursion(n - 1);
      
        return factorial;
    }
}