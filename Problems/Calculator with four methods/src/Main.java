class SimpleCalculator {
    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        long result = a - b;
        System.out.println(result);
    }


    public static void sumTwoNumbers(long a, long b) {
        long result = a + b;
        System.out.println(result);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            long result = a / b;
            System.out.println(result);
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        long result = a * b;
        System.out.println(result);
    }
}