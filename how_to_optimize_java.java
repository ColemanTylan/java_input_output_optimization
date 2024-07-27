import java.util.Scanner;


public class how_to_optimize_java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            String[] output = input.split(" ");
            String outputStr = output[0];
            int outputInt = Integer.parseInt(output[1]);
            System.out.printf("%-15s%03d\n", outputStr, outputInt);
        }

        System.out.println("================================");
    }
}


