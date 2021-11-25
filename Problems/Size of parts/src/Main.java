import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfParts = scanner.nextInt();
        int partShipped = 0;
        int partFixed = 0;
        int partRejects = 0;
        for (int i = 0; i < numOfParts; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                partShipped++;
            } else if (num == -1) {
                partRejects++;
            } else {
                partFixed++;
            }
        }
        System.out.printf(partShipped + " " + partFixed +
                " " + partRejects);

    }
}