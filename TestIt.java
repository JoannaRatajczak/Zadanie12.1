public class TestIt {

    public static void main(String[] args) throws IncorrectAgeException, NameUndefinedException {
        //Person person = null;
        try {
            Person person1 = Methods.scanNewPerson();
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        } catch (NameUndefinedException e) {
            e.printStackTrace();
        }

        Person person2 = null;
        person2.setLastName(null);

    }

}
