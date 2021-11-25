import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int counter = 0;
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        for (int countNum : array) {
            if (countNum == num) {
                ++counter;
            }
        }
        System.out.println(counter);
    }
}