import java.util.Scanner;

public class VulnerableCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Your password is: " + password);
    }
}
