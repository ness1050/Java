
public class ControlFlow {

    public static void main (String [] args) {

        int number = 11;
        ControlFlow f = new ControlFlow();

        f.checkIfnumberIsPrim(number);
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
}