import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userAge;

        System.out.println("Hello - what is your age?");

        if (scan.hasNextInt()) {
            userAge = scan.nextInt();
            if (userAge >= 21) {
                 System.out.println("You are 21 or over. You get a wristband.");
            } else if (userAge < 0){
                System.out.println("You have inputted an invalid response.");
                System.exit(0);
            } else {
                System.out.println("You are under 21. You do not get a wristband.");
            }
        } else {
            System.out.println("You have inputted an invalid response.");
            System.exit(0);
        }

    }
}