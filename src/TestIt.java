public class TestIt {

    public static void main(String[] args) {
        Person person1= new Person();
        try {
            person1 = Methods.scanNewPerson();
        } catch (NameUndefinedException e) {System.out.println("Name too short or null");}
        catch (IncorrectAgeException e) {System.out.println("Wrong age");}

        System.out.println(person1);
    }
}
