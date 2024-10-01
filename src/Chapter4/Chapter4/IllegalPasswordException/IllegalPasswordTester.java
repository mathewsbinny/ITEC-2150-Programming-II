package CustomeException.IllegalPasswordException;

public class IllegalPasswordTester {
    public static void main(String[] args) {
        int passwordLength = 8;

        java.util.Scanner input = new java.util.Scanner(System.in);

/**
 * 1. A password must have at least eight characters.
 * 2. A password consists of only letters and digits.
 * 3. A password must contain at least two digits
 */

        System.out.println("Create a new password: ");
        int digitCount = 0;
        int letterCount = 0;
        boolean valid = false;
        while(!valid) {
            try {
                String pw = input.nextLine();
                //  input.close();  --> if you add this here, then you will have
                //  IllegalStateException because Scanner closed.
                if (pw.length() < passwordLength) {
                    throw new IllegalPasswordException("a password must have at least " +
                            "eight characters.");
                }
                for (int i = 0; i < pw.length(); i++) {
                    if (!Character.isLetterOrDigit(pw.charAt(i))) {
                        throw new IllegalPasswordException("A password must contain " +
                                "only letters and digits.");

                    }
                    if (Character.isDigit(pw.charAt(i))) {
                        digitCount++;
                    }
                    if (Character.isLetter(pw.charAt(i))) {
                        letterCount++;
                    }
                }

                //password must contain at least two digits and rest of the pw should
                // be letters.
                if (digitCount < 2 || letterCount < 1) {
                    throw new IllegalPasswordException("A password must contain at " +
                            "least two digits and rest of character must be letters.");
                }

                valid = true;
                System.out.println("Your password is created successfully");
                System.out.println("password is " + pw);
            } catch (IllegalPasswordException e) {
                System.out.println(e); //this will print out string value from the
                // throwing statement for each exception case.
                System.out.println("Invalid password. Try it again. ");
            }
        }
        input.close();
    }
}
