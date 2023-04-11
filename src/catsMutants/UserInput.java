package catsMutants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public static String enterName(){
        System.out.println("Pls enter your name: ");
        return new Scanner(System.in).nextLine();
    }

    public static void takeUserInputAttack() {

        System.out.println("Pls enter the number of direction for attack:\n1: HEAD\n2: TORSO\n3: LEGS");
        int enteredAttack = 0;
        try {
            enteredAttack = new Scanner(System.in).nextInt();
            switch (enteredAttack) {
                case 1:
                case 2:
                case 3:
                   break;
                default:
                    System.out.println("Wrong number of direction to attack. "
                            + "Pls enter the number of direction for attack:\n1: HEAD\n2: TORSO\n3: LEGS");
                    new Scanner(System.in).nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong direction to attack. "
                    + "Pls enter the number of direction for attack:\n1: HEAD\n2: TORSO\n3: LEGS."
                    +"\nAnd don't screw up this time");
            new Scanner(System.in).nextInt();
        }
    }

    public static void takeUserInputBlock() {
        System.out.println("Pls enter the number of direction to block:\n1: HEAD\n2: TORSO\n3: LEGS");
        int enteredBlock = 0;
        try {
            enteredBlock = new Scanner(System.in).nextInt();
            switch (enteredBlock) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    System.out.println("Wrong number of direction to block. "
                            + "Pls enter the direction to block:\n1: HEAD\n2: TORSO\n3: LEGS");
                    new Scanner(System.in).nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong number of direction to block."
                    +"Pls enter the number of direction to block:\n1: HEAD\n2: TORSO\n3: LEGS"
                    + "\nAnd don't screw up this time");
            new Scanner(System.in).nextInt();
        }
    }

    public static String takeUserAnswer(){
        String answer = new Scanner(System.in).nextLine();
        switch (answer){
            case "y": case "Yes":
                return "Yes";
            default:
                return "No";
        }
    }

}

