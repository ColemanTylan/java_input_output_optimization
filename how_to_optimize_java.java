import java.util.Scanner;

// The input must be three letters then any three numbers EX: abc 234 OR dlw 649
// This uses printf to format the output
// This is brute force solution

public class how_to_optimize_java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();

        String[] output = input.split(" ");
        String insideOutputStr = output[0];
        int insideOutputInt = Integer.parseInt(output[1]);

        String[] output2 = input2.split(" ");
        String insideOutput2Str = output2[0];
        int insideOutput2Int = Integer.parseInt(output2[1]);

        String[] output3 = input3.split(" ");
        String insideOutput3Str = output3[0];
        int insideOutput3Int = Integer.parseInt(output3[1]);

        System.out.println("================================");
        System.out.printf("%-15s%03d\n", insideOutputStr, insideOutputInt);
        System.out.printf("%-15s%03d\n", insideOutput2Str, insideOutput2Int);
        System.out.printf("%-15s%03d\n", insideOutput3Str, insideOutput3Int);
        System.out.println("================================");
    }
}


