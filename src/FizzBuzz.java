
/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    // this is a private class, but I'll make it public to be able to run it
    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        
    }

    public static void main(String[] args) {
        /*
        
        for (int i = 1; i < 100; i++) {
         */
        int i = 1;
        while (i < 100) {
            doFizzBuzz(i); // this is what the step 2 task 2 is supposed to create
            i = method(i);
        }
    }

    private static int method(int i) {
        i++;
        return i;
    }
}
