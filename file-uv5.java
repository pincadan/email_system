import java.util.Scanner;

public class EmailSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] emails = {"john@example.com", "jane@example.com", "bob@example.com"};
        String[] passwords = {"password1", "password2", "password3"};
        
        System.out.println("Welcome to the Email System!");
        
        // User login
        System.out.println("Please enter your email:");
        String email = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        
        boolean isAuthenticated = false;
        for (int i = 0; i < emails.length; i++) {
            if (email.equals(emails[i]) && password.equals(passwords[i])) {
                isAuthenticated = true;
                break;
            }
        }
        
        if (!isAuthenticated) {
            System.out.println("Invalid email or password. Access denied.");
            return;
        }
        
        // User menu
        System.out.println("Welcome, " + email + "!");
        System.out.println("Please select an option:");
        System.out.println("1. Compose a new email");
        System.out.println("2. View inbox");
        System.out.println("3. View sent emails");
        System.out.println("4. Logout");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character
        
        switch (choice) {
            case 1:
                composeEmail(scanner);
                break;
            case 2:
                viewInbox();
                break;
            case 3:
                viewSentEmails();
                break;
            case 4:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private static void composeEmail(Scanner scanner) {
        System.out.println("Enter the recipient email:");
        String recipient = scanner.nextLine();
        System.out.println("Enter the subject:");
        String subject = scanner.nextLine();
        System.out.println("Enter the message:");
        String message = scanner.nextLine();
        
        System.out.println("Email sent successfully!");
        System.out.println("From: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
    
    private static void viewInbox() {
        System.out.println("You have no new messages in your inbox.");
    }
    
    private static void viewSentEmails() {
        System.out.println("You have no sent emails.");
    }
}