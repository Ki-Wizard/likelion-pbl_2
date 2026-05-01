package class2.package1;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public String validateState() {
        if (isBlank(name)) {
            return "Name must not be blank.";
        }

        if (isBlank(major)) {
            return "Major must not be blank.";
        }

        if (generation < 1) {
            return "Generation must be at least 1.";
        }

        return null;
    }

    public void printInfo() {
        System.out.println("[Lion Info]");
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Generation: " + generation);
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
