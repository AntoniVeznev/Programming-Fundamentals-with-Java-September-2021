package Labs.L02DataTypesAndVariables;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char symbol = input.charAt(0);
        if (symbol >= 65 && symbol <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
