package helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHelper {
    public static int isValueInt() {
        while (true) {
            try {
                return new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only whole numbers accepted. Please try again.");
            }
        }
    }
}
