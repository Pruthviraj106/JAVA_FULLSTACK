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
        keyword = keyword.toLowerCase();

        for (String feedback : feedbackList) {
            String[] words = feedback.toLowerCase().split("\\s+");

            String prev = "";
            for (String word : words) {
                if (word.equals(keyword) && !word.equals(prev)) {
                    count++;
                }
                prev = word;
            }
        }

        System.out.println("🔍 '" + keyword + "' occurred (non-spam) " + count + " time(s).");
    }

    public void generateReport() {
        int total = feedbackList.size();
        if (total == 0) {
            System.out.println("📊 Total: 0, Avg: 0, Max: 0, Min: 0");
            return;
        }

        int max = 0, min = Integer.MAX_VALUE, totalWords = 0;

        for (String feedback : feedbackList) {
            String[] words = feedback.trim().split("\\s+");
            totalWords += words.length;
            if (words.length > max) max = words.length;
            if (words.length < min) min = words.length;
        }

        double avg = (double) totalWords / total;
        System.out.printf("📊 Total: %d, Avg: %.2f, Max: %d, Min: %d\n", total, avg, max, min);

        generateWordFrequency();
    }

    private void generateWordFrequency() {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (String feedback : feedbackList) {
            String[] tokens = feedback.toLowerCase().split("\\s+");

            String prev = "";
            for (String word : tokens) {
                if (word.equals(prev)) continue; // skip spam (consecutive)
                prev = word;

                int index = words.indexOf(word);
                if (index == -1) {
                    words.add(word);
                    counts.add(1);
                } else {
                    counts.set(index, counts.get(index) + 1);
                }
            }
        }

        System.out.println("📌 Word Frequency (no spam):");
        for (int i = 0; i < words.size(); i++) {
            System.out.println("   " + words.get(i) + ": " + counts.get(i));
        }
    }
}
