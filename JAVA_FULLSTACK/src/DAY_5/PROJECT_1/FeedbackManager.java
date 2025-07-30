package DAY_5.PROJECT_1;

import java.util.*;
import java.util.regex.*;

public class FeedbackManager {
    private List<String> feedbackList;

    public FeedbackManager() {
        feedbackList = new ArrayList<>();
    }

    public void addFeedback(String feedback) {
        feedbackList.add(feedback);
        System.out.println("✅ Feedback added successfully.");
    }

    public void viewAllFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("❌ No feedback available.");
        } else {
            int i = 1;
            for (String feedback : feedbackList) {
                System.out.println(i++ + ". " + feedback);
            }
        }
    }

    public void cleanFeedback() {
        List<String> cleanedList = new ArrayList<>();
        for (String feedback : feedbackList) {
            String cleaned = feedback.replaceAll("[^a-zA-Z0-9@.\\s]", "").trim();
            cleanedList.add(cleaned);
        }
        feedbackList = cleanedList;
        System.out.println("✅ Feedback cleaned.");
    }

    public void maskSensitiveInfo() {
        List<String> maskedList = new ArrayList<>();
        for (String feedback : feedbackList) {
            String masked = feedback;
            masked = masked.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}", "[EMAIL]");
            masked = masked.replaceAll("\\b\\d{10}\\b", "[PHONE]");
            maskedList.add(masked);
        }
        feedbackList = maskedList;
        System.out.println("✅ Sensitive info masked.");
    }

    public void countKeyword(String keyword) {
        int count = 0;
        for (String feedback : feedbackList) {
            count += Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE)
                    .matcher(feedback).results().count();
        }
        System.out.println("🔍 '" + keyword + "' occurred " + count + " time(s).");
    }

    public void generateReport() {
        int total = feedbackList.size();
        if (total == 0) {
            System.out.println("📊 Total: 0, Avg: 0, Max: 0, Min: 0");
            return;
        }

        int max = 0, min = Integer.MAX_VALUE, totalWords = 0;

        for (String feedback : feedbackList) {
            int words = feedback.trim().split("\\s+").length;
            totalWords += words;
            if (words > max) max = words;
            if (words < min) min = words;
        }

        double avg = (double) totalWords / total;
        System.out.printf("📊 Total: %d, Avg: %.2f, Max: %d, Min: %d\n", total, avg, max, min);
    }
}
