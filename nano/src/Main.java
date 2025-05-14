
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person p = new Person("Mych", "Evangelio");
        Person p1 = new Person("Linds", "Paypon");

        System.out.println();
        System.out.println("Your Pet");
        Pet pet = new Pet("Bruno", "Bulldog", 2);
        System.out.println("Name: " + pet.getName());
        System.out.println("Breed: " + pet.getBreed());
        System.out.println("Age: " + pet.getAge());


        Person person = new Person("Cruz", "Juan");

        System.out.println(person.getLastName() + ", " + person.getFirstName());


    }
}