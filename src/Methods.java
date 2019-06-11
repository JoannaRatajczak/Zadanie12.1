import java.util.Scanner;

public class Methods {

    static Person scanNewPerson() throws NameUndefinedException, IncorrectAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane nowej osoby: \nImię, nazwisko, wiek, pesel");
        String fn = scanner.nextLine();
        String ln = scanner.nextLine();
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        return new Person(fn, ln, a, p);
    }
}
