
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        System.out.println();
        System.out.println("Your Pet");
        Pet pet = new Pet("Bruno", "Bulldog", 2);
        System.out.println("Name: " + pet.getName());
        System.out.println("Breed: " + pet.getBreed());
        System.out.println("Age: " + pet.getAge());

        Person person = new Person("Cruz", "Juan", 23);

        System.out.println(person.getLastName() + ", " + person.getFirstName());


    }
}