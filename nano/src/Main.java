
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello world!");

        System.out.println();
        System.out.println("Your Pet");
        Pet pet = new Pet("Bruno", "Bulldog", 2);
        System.out.println("Name: " + pet.getName());
        System.out.println("Breed: " + pet.getBreed());
        System.out.println("Age: " + pet.getAge());
    }
}