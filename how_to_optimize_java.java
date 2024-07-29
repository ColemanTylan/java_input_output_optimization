// This imports the Scanner class so I can use it to read input streams like System.in
import java.util.Scanner;

// To optimize brute force code solution put repeated code into for loop
// Also create seperate method so if changes needs to be done will only need to be done in one place
// Use for loop b/c  exact number of iterations is known. Other wise use while loop
public class how_to_optimize_java {

    // To optimize further
    public static void main(String[] args) {
//Turning the Scanner object into a variable so it can be used
        Scanner scanner = new Scanner(System.in);
//output decoration
        System.out.println("================================");
// Only need 3 iterations, number of iterations are known so use for loop and not while loop
        for (int i = 0; i < 3; i++) {
// scanner.nextLine() passed as arg into processInput as 'input' param var
            processInput(scanner.nextLine());
        }
        System.out.println("================================");
    }
    // creates processInput method as Static void
    private static void processInput(String input) {
//Creating array of strings as a variable named 'output'
//The input stream in 'input' var splits into the array at every space, which is defined in split(" ")
        String[] output = input.split(" ");
// creating var to hold the first string in the 'output' array of strings which comes from input stream
        String outputStr = output[0];
//Turning the 2nd input collected in the 'output' var into an integer b/c I want to collect numbers for the 2nd input
        int outputInt = Integer.parseInt(output[1]);
//Using Printf to format the output and setting the vars in the params I want to output
        System.out.printf("%-15s%03d\n", outputStr, outputInt);
    }
// This repeats 3 times to optimize the brute force solution earlier
}


