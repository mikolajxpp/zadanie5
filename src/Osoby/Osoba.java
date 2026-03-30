package Osoby;

public class Osoba {
    private String imie;
    private String nazwisko;

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
