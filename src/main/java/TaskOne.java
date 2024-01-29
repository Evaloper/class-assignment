import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your full name: ");
        String fullName = reader.nextLine();

        System.out.println("Hello " + fullName + "! Welcome to Elementary Maths Assessment. This is to test your elementary skill.");

        String letPlay;

        System.out.println("Are you ready? If yes, type yes; otherwise come back later.");

        letPlay = reader.nextLine();

       while (letPlay.equalsIgnoreCase("yes")){
           int num1 = random.nextInt(1, 100) ;
           int num2 = random.nextInt( 1, 20);

           int result = 0;


//        int sum = num1 + num2;

           System.out.println("What is the addiction of " + num1 + "+" + num2);
           int yourSum = reader.nextInt();

           int correctSum = num1 + num2;

           if (yourSum == correctSum){
               System.out.println("You are correct");
               result++;
           } else {
               System.out.println(yourSum + " is the wrong answer. " + "The correct answer is " + " " + correctSum);
           }

           System.out.println("What is the subtraction of "  + num1 + "-" + num2);
           int yourSubtract = reader.nextInt();

           int correctSubtract = num1 - num2;
           if(yourSubtract == correctSubtract){
               System.out.println("You are correct");
               result++;
           } else {
            System.out.println(yourSubtract + " is the wrong answer. " + "The correct answer is " + " " + correctSubtract);
           }


           System.out.println("What is the multiplication of " + num1 + "*" + num2);
           int yourMultiply = reader.nextInt();

           int correctMultiply = num1 * num2;
           if (yourMultiply == correctMultiply){
               System.out.println("You are correct");
               result++;
           } else {
               System.out.println(yourMultiply + " is the wrong answer. " + "The correct answer is " + " " + correctMultiply);
           }


           System.out.println("What is the division of "  + num1 + "/" + num2);
           int yourDivision = reader.nextInt();

           int correctDivision = num1 / num2;

           if(yourDivision == correctDivision){
               System.out.println("You are correct");
               result++;
           } else {
               System.out.println( yourDivision + " is the wrong Answer. " + "The correct answer is " + " " + correctDivision);
           }
           System.out.println("Your total score is " + result + " out of 4 questions");
           System.out.println("This is the end of your elementary assessment, type no to terminate.");
           reader.nextLine();
           letPlay = reader.nextLine();
           System.out.println("Thanks for taking the assessment.");
       }

        System.out.println("It was nice having you here" + " " + fullName);

    }


}
