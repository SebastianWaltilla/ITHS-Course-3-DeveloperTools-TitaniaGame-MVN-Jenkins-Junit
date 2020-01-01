package Game;

import java.util.Scanner;

public class GetInput {

    static Scanner scanner = new Scanner(System.in);


    public static String getInputString() {
        String s = scanner.nextLine();
        return s;
    }

    public static int getInputInt() {
        int s = Integer.parseInt(scanner.nextLine());
        return s;
    }

    public static double getInputDouble() {
        double s = Double.parseDouble(scanner.nextLine());
        return s;
    }


}
