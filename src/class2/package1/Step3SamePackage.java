package class2.package1;

public class Step3SamePackage {
    public static void main(String[] args) {
        Lion lion = new Lion("OldName", "Computer Science", 13);

        System.out.println("Step 3: Access fields from the same package.");
        lion.name = "SamePackageName";
        lion.major = "Software Engineering";

        // The private field cannot be accessed directly, even in the same package.
        // lion.generation = 14;
        // Expected compile error:
        // generation has private access in class2.package1.Lion

        lion.printInfo();
    }
}
