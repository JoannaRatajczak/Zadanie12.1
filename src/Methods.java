import java.util.Scanner;

public class Methods {

    static Person scanNewPerson() throws NameUndefinedException, IncorrectAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane nowej osoby: \nImię, nazwisko, wiek, pesel");
        String fn = scanner.nextLine();
        if (fn.length() < 2 || fn ==null) throw new NameUndefinedException();
        String ln = scanner.nextLine();
        if (ln.length() < 2 || ln ==null) throw new NameUndefinedException();
        int a = scanner.nextInt();
        if (a<0) throw new IncorrectAgeException();
        int p = scanner.nextInt();
        return new Person(fn, ln, a, p);
    }
}
