package com.mycompany.lab1;
import java.util.Scanner;
public class Student {
    // prywatne zmienne:
    private String imie;
    private String nazwisko;
    private int wiek;
    private String kierunek;
    private int rok;
    Scanner scanner = new Scanner(System.in);

    // konstruktor zaciągający dane z konsoli
    public Student() {
        System.out.print("Podaj imię: ");
        this.imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        this.nazwisko = scanner.nextLine();

        // sprawdzenie czy wprowadzone dane to liczba
        while(true) {
            System.out.print("Podaj wiek (liczbowo): ");
            try {
                this.wiek = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("To nie liczba! ");
            }
        }

        System.out.print("Podaj kierunek studiów: ");
        this.kierunek = scanner.nextLine();

        // sprawdzenie czy wprowadzone dane to liczba
        while(true) {
            System.out.print("Podaj rok (liczbowo): ");
            try {
                this.rok = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("To nie liczba! ");
            }
        }

    }
    // metoda do wyświetlania wprowadzonych danych na konsoli
    public void drukuj() {
        System.out.println("Imię i nazwisko: "+imie+" "+nazwisko);
        System.out.println("Wiek: "+wiek+" lat");
        System.out.println("Kierunek i rok: "+kierunek+", "+rok+" rok");
    }
}
