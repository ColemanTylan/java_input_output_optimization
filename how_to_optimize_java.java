// This imports the Scanner class so I can use it to read input streams like System.in
import java.util.Scanner;

// To optimize code put all repeated code into for loop
// Use for loop b/c  exact number of iterations is known. Other wise use while loop
public class how_to_optimize_java {

    public static void main(String[] args) {
//Turning the Scanner object into a variable so it can be used
        Scanner scanner = new Scanner(System.in);
//output decoration
        System.out.println("================================");
// Only need 3 iterations, number of iterations are known so use for loop and not while loop
        for (int i = 0; i < 3; i++) {
//nextLine() method reads input from scanner object created earlier, putting this into var named 'input'
            String input = scanner.nextLine();
//Creating array of strings as a variable named 'output'
//The input stream in 'input' var splits into the array at every space, which is defined in split(" ")
            String[] output = input.split(" ");
// creating var to hold the first string in the 'output' array of strings which comes from input stream
            String outputStr = output[0];
//Turning the 2nd input collected in the 'output' var into an integer b/c I want to collect numbers for the 2nd input
            int outputInt = Integer.parseInt(output[1]);
//Using Printf to format the output and setting the vars in the params I want to output
//
            System.out.printf("%-15s%03d\n", outputStr, outputInt);
        }

        System.out.println("================================");
    }
// This repeats 3 times to optimize the brute force solution earlier
}


