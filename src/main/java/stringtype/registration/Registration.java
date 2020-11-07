package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Please provide a username");
        String username = scanner.nextLine();
        System.out.println("Provided username is valid: " + userValidator.isValidUsername(username));

        System.out.println("Please provide a password");
        String password1 = scanner.nextLine();

        System.out.println("Please confirm password by typing for the second time");
        String password2 = scanner.nextLine();
        System.out.println("Provided password is valid: " + userValidator.isValidPassword(password1, password2));

        System.out.println("Please provide your email address");
        String email = scanner.nextLine();
        System.out.println("Provided email is valid: " + userValidator.isValidEmail(email));

    }
}
