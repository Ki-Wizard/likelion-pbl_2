package class2.package2;

import class2.package1.Lion;

public class Step3OtherPackage {
    public static void main(String[] args) {
        Lion lion = new Lion("OldName", "Computer Science", 13);

        System.out.println("Step 3: Access fields from another package.");
        lion.name = "OtherPackageName";

        // The default field cannot be accessed directly from another package.
        // lion.major = "Software Engineering";
        // Expected compile error:
        // major is not public in class2.package1.Lion; cannot be accessed from outside package

        // The private field cannot be accessed directly from another package.
        // lion.generation = 14;
        // Expected compile error:
        // generation has private access in class2.package1.Lion

        lion.printInfo();
    }
}
