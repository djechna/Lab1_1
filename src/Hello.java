import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek (liczbowo): ");
        String wiek = scanner.nextLine();

        System.out.print("Podaj kierunek studiów: ");
        String kierunek = scanner.nextLine();

        System.out.print("Podaj rok (liczbowo): ");
        String rok = scanner.nextLine();

        System.out.println("Imię i nazwisko: "+imie+" "+nazwisko);
        System.out.println("Wiek: "+wiek+" lat");
        System.out.println("Kierunek i rok: "+kierunek+", "+rok+" rok");
    }
}