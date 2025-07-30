package DAY_5.PROJECT_1;

import java.util.*;

public class FeedbackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FeedbackManager manager = new FeedbackManager();

        while (true) {
            System.out.println("\n===== Customer Feedback Analyzer =====");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean Feedback");
            System.out.println("4. Mask Emails/Phones");
            System.out.println("5. Count Keyword Occurrence");
            System.out.println("6. Generate Feedback Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter feedback: ");
                        String fb = scanner.nextLine();
                        manager.addFeedback(fb);
                        break;
                    case 2:
                        manager.viewAllFeedback();
                        break;
                    case 3:
                        manager.cleanFeedback();
                        break;
                    case 4:
                        manager.maskSensitiveInfo();
                        break;
                    case 5:
                        System.out.print("Enter keyword to count: ");
                        String keyword = scanner.nextLine();
                        manager.countKeyword(keyword);
                        break;
                    case 6:
                        manager.generateReport();
                        break;
                    case 7:
                        System.out.println("👋 Exiting. Thank you!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("❌ Invalid choice. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }
    }
}
