import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        if (firstNum + secondNum == 20 || secondNum + thirdNum == 20 || firstNum + thirdNum == 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}