public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }

    public Person() {}

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        if (firstName.length() < 2 || firstName == null) throw new NameUndefinedException("Wrong input");
        this.lastName = lastName;
        if (lastName.length() < 2 || lastName == null) throw new NameUndefinedException("Wrong input");
        this.age = age;
        if (age < 0) throw new IncorrectAgeException("Wrong input");
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
