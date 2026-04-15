import Osoby.Osoba;

public class Main {
    public static void main(String[] args) {
        BuforCykliczny bufor = new BuforCykliczny();

        //Przyklad z tresci zadania
        Osoba o1 = new Osoba("im1", "nz1");
        Osoba o2 = new Osoba("im2", "nz2");
        Osoba o3 = new Osoba("im3", "nz3");
        bufor.dodaj(o1);
        bufor.dodaj(o1);
        bufor.dodaj(o2);
        bufor.pobierz();
        bufor.dodaj(o2); 
        bufor.pobierz(); 
        bufor.dodaj(o3);
        bufor.wypisz();
    }
}
