import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 500, 50, 10));

        System.out.println("=== Initial state of military objects ===");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
        System.out.println();

        Spy agent = new SecretAgent("Agent Smith");
        System.out.println("=== SecretAgent visiting objects ===");
        for (MilitaryObject military : militaryObjects) {
            military.accept(agent);
        }
        System.out.println();

        System.out.println("=== After SecretAgent ===");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
        System.out.println();

        Spy saboteur = new Saboteur("Saboteur Max");
        System.out.println("=== Saboteur visiting objects ===");
        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
        }
        System.out.println();

        System.out.println("=== After Saboteur ===");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }
}
