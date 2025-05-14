public class Person {

    private String lastName;
    private String firstName;
    private String middleName;
    

    public Person(String lastname, String firstName){
        this.firstName = firstName;
        this.lastName = lastname;
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
