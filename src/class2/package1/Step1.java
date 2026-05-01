package class2.package1;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Step 1: main validates input before creating Lion.");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter major: ");
        String major = scanner.nextLine();

        System.out.print("Enter generation: ");
        String generationInput = scanner.nextLine();

        Integer generation;
        try {
            generation = Integer.parseInt(generationInput.trim());
        } catch (NumberFormatException e) {
            generation = null;
        }

        String errorMessage = null;
        if (name == null || name.trim().isEmpty()) {
            errorMessage = "Name must not be blank.";
        } else if (major == null || major.trim().isEmpty()) {
            errorMessage = "Major must not be blank.";
        } else if (generation == null) {
            errorMessage = "Generation must be a number.";
        } else if (generation < 1) {
            errorMessage = "Generation must be at least 1.";
        }

        if (errorMessage != null) {
            System.out.println("Input validation failed: " + errorMessage);
            System.out.println("Lion object will not be created.");
            return;
        }

        System.out.println("Input validation passed. Creating Lion object.");
        Lion lion = new Lion(name, major, generation);
        lion.printInfo();
    }
}
