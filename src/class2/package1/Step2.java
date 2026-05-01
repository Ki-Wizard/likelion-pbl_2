package class2.package1;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Step 2: Lion validates its own state.");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter major: ");
        String major = scanner.nextLine();

        System.out.print("Enter generation: ");
        String generationInput = scanner.nextLine();

        int generation = parseGeneration(generationInput);

        System.out.println("Creating Lion object before validation.");
        Lion lion = new Lion(name, major, generation);

        String errorMessage = lion.validateState();
        if (errorMessage != null) {
            System.out.println("Lion state validation failed: " + errorMessage);
            return;
        }

        System.out.println("Lion state validation passed. Printing current info.");
        lion.printInfo();
    }

    private static int parseGeneration(String generationInput) {
        try {
            return Integer.parseInt(generationInput.trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
