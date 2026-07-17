package July11to12;
    //Java Programming Exercise 2: Rock, Paper Scissors Game in Java

import java.util.Random;
import java.util.Scanner;

public class T20_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Person 1 Enter rock/paper/scissors: ");
        String person1 = sc.nextLine();
        System.out.print("Person 2 Enter rock/paper/scissors: ");
        String person2 = sc.nextLine();

        if (person1.equals("scissors") && person2.equals("scissors")) {
            System.out.println("Draw try again!");
        } else if (person1.equals("paper") && person2.equals("paper")) {
            System.out.println("Draw try again!");
        } else if (person1.equals("rock") && person2.equals("rock")) {
            System.out.println("Draw try again!");
        } else if (person1.equals("scissors") && person2.equals("paper")) {
            System.out.println("Person 1 win!");
        } else if (person1.equals("paper") && person2.equals("scissors")) {
            System.out.println("Person 2 win!");
        } else if  (person1.equals("paper") && person2.equals("rock")) {
            System.out.println("Person 1 win!");
        } else if  (person1.equals("rock") && person2.equals("paper")) {
            System.out.println("Person 2 win!");
        } else if  (person1.equals("rock") && person2.equals("scissors")) {
            System.out.println("Person 1 win!");
        } else if  (person1.equals("scissors") && person2.equals("rock")) {
            System.out.println("Person 2 win!");
        } else {
            System.out.println("Invalid Input!");
        }

        // against computer with 3 round
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter Your Name: ");
        String userName = scan.nextLine();

        int userScore = 0;
        int computerScore = 0;

        for (int round = 1; round <= 3; round++) {
            System.out.println("     Round : " + round);
            System.out.print("Enter 1 for rock/ 2 for paper/ 3 for scissors: ");
            String userInput = scan.nextLine();
            String user = "";

            if (userInput.equals("1")) {
                user = "Rock";
            } else if (userInput.equals("2")) {
                user = "Paper";
            } else if (userInput.equals("3")) {
                user = "Scissors";
            } else {
                System.out.println("Invalid input");
                return;
            }
            System.out.println("User: " + user);

            int computer = rand.nextInt(3);
            String com = "";

            if (computer == 0) {
                com = "Rock";
            }  else if (computer == 1) {
                com = "Paper";
            }   else if (computer == 2) {
                com = "Scissors";
            }
            System.out.println("Computer: " + com);

            if (com.equals(user)) {
                System.out.println("Draw try again!");
            }  else if (com.equals("Scissors") && user.equals("Paper")) {
                computerScore++;
                System.out.println("Computer win!");
            } else if (com.equals("Paper") && user.equals("Scissors")) {
                System.out.println(userName +" win!");
                userScore++;
            } else if  (com.equals("Paper") && user.equals("Rock")) {
                System.out.println("Computer win!");
                computerScore++;
            } else if  (com.equals("Rock") && user.equals("Paper")) {
                System.out.println(userName +" win!");
                userScore++;
            } else if  (com.equals("Rock") && user.equals("Scissors")) {
                System.out.println("Computer win!");
                computerScore++;
            } else if  (com.equals("Scissors") && user.equals("Rock")) {
                System.out.println(userName +" win!");
                userScore++;
            } else {
                System.out.println("Invalid Input!");
            }
            System.out.println("Computer: " + computerScore);
            System.out.println( userName + " : " + userScore);
        }
        if (computerScore < userScore) {
            System.out.println(userName + " win the match!");
        } else if (computerScore > userScore) {
            System.out.println("Computer win the match!");
        } else {
            System.out.println("Match draw try again!");
        }
    }
}
