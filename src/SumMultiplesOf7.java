public class SumMultiplesOf7 {

    // Returns the sum of all multiples of 7 between n1 and n2
    public static int sumMultiplesOf7(int n1, int n2) {

        // Base case: stop when n1 passes n2
        if (n1 > n2) {
            return 0;
        }

        // If n1 is a multiple of 7, add it to the result
        if (n1 % 7 == 0) {
            return n1 + sumMultiplesOf7(n1 + 1, n2);
        }

        // If n1 is not a multiple of 7, move to the next number
        return sumMultiplesOf7(n1 + 1, n2);
    }
}