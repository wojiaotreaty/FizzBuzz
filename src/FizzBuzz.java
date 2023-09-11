/**
 * Solve the FizzBuzz challenge.
 */
//class FizzBuzz {
//
//    public static void main(String[] args) { // Running the file will run anything under the main method of a class
//
//        for (int i = 1; i < 100; i++) {
//            // For loop is implemented by declaring a counting variable, a limit to its increment, and the increment rate
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0; // Different as you need to verbally declare the type
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) { // Brackets are used instead of colons
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz"); // Printing is very similar, just a different form of syntax.
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz"); // Statements all end in semicolons
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
//    }
//}

// The function ran without needing to be called.

// While loop rewrite

class FizzBuzz {
    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; // Different as you need to verbally declare the type
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // Brackets are used instead of semicolons

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz"); // Printing is very similar, just a different form of syntax.

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        i++;
        return i;
    }
}