public class TestClass {

    public static void main(String[] args) {

        // -------------------------
        // Test Task 1

        System.out.println("Task 1:");
        HelloWorldRecursion.printHelloWorld(5);


        // -------------------------
        // Test Task 2

        System.out.println("\nTask 2:");

        int n1 = 1;
        int n2 = 30;

        int sum = SumMultiplesOf7.sumMultiplesOf7(n1, n2);

        System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + ": " + sum);

        // -------------------------
        // Test Task 3

        System.out.println("\nTask 3:");

        // Binary search requires a sorted array
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int target = 14;

        int index = RecursiveBinarySearch.binarySearch(numbers, 0, numbers.length - 1, target);

        // Display the result of the search
        if (index == -1) {
            System.out.println(target + " was not found.");
        }
        else {
            System.out.println(target + " was found at index " + index + ".");
        }
    }
}