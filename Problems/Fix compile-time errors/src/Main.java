import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        if (line1 == null || line2 == null) {
            System.out.println("Wrong input");
        }
        System.out.println(line2);
        System.out.println(line1);
    }
}