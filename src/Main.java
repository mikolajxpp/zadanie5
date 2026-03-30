import Osoby.Agent;
import Osoby.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba[] tablicaOs = new Osoba[4];
        // Add osoby
        Osoba test = new Agent("Imie", "nazwisko");
        for (int i = 0; i < 3; i++) {
            if (BuforCykliczny.czyPelna(tablicaOs)) {
                tablicaOs = BuforCykliczny.extendOsoby(tablicaOs);
            }
            tablicaOs[i] = new Osoba("Imie" + i, "Nazwisko" + i);
        }
        tablicaOs[0] = test;
        for (Osoba osoba: tablicaOs) {
            System.out.println(osoba);
        }
    }
}
