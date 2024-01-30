import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String input1 = reader.nextLine();

        System.out.println("Compare: ");
        String input2 = reader.nextLine();

        if(input1.equals(input2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
