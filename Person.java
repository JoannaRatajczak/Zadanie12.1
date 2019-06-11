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


    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {

        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        this.firstName = firstName;
        if (firstName.length() < 2 || firstName == null) throw new NameUndefinedException("Wrong input");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        this.lastName = lastName;
        if (lastName.length() < 2 || lastName == null) throw new NameUndefinedException("Wrong input");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;
        if (age < 0) throw new IncorrectAgeException("Wrong input");
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
