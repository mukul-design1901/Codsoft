package Result;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1️⃣ Input marks
        float[] marks = new float[5];
        String[] subjects = {"English", "Hindi", "Science", "Social Studies", "Mathematics"};

        for (int i = 0; i < 5; i++) {
            marks[i] = getValidMarks(in, subjects[i]);
        }

        // 2️⃣ Calculate Total Marks
        float total = 0;
        for (float m : marks) {
            total += m;
        }

        // 3️⃣ Calculate Average Percentage
        float percentage = total / marks.length;

        // 4️⃣ Grade Calculation
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        // 5️⃣ Display Results
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        in.close();
    }

    // 🔐 Input validation (0–100)
    public static float getValidMarks(Scanner in, String subject) {
        float marks;

        while (true) {
            System.out.print("Enter " + subject + " marks (0-100): ");
            marks = in.nextFloat();

            if (marks >= 0 && marks <= 100) {
                return marks;
            } else {
                System.out.println("❌ Invalid input! Please enter between 0 and 100.");
            }
        }
    }
}

