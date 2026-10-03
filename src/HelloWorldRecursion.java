public class HelloWorldRecursion {

    // Prints "Hello World" n times using recursion
    public static void printHelloWorld(int n) {

        // Base case: stop when n reaches 0
        if (n <= 0) {
            return;
        }

        // Print the message once
        System.out.println("Hello World");

        // Recursive call with a smaller value of n
        printHelloWorld(n - 1);
    }
}