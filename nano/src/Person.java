public class Person {

    private String lastName;
    private String firstName;

    private int age;

    public Person(String lastname, String firstName, int age){
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
