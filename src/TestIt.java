public class TestIt {

    public static void main(String[] args) {
        Person person1 = new Person();
        try {
        person1 = Methods.scanNewPerson();}
        catch (IncorrectAgeException e){ e.printStackTrace();}
        catch (NameUndefinedException e){ e.printStackTrace();}
        System.out.println(person1);
    }
}
