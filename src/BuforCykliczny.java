import Osoby.Osoba;

public class BuforCykliczny {

    private static int zapelnienie(Osoba[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == null) {
                return i;
            }
        }
        return tab.length;
    }
    public static boolean czyPelna(Osoba[] tab) {
        return zapelnienie(tab) == tab.length;
    }
    public static Osoba[] extendOsoby(Osoba[] tab) {
        Osoba[] temp = tab.clone();
        Osoba[] newTab = new Osoba[tab.length * 2];
        System.arraycopy(temp, 0, tab, 0, temp.length);
        return newTab;
    }
    public static Osoba[] shortenOsoby(Osoba[] tab) {
        int zap = zapelnienie(tab);
        if ((double) zap / tab.length > 0.25) {
             return tab;
        }
        Osoba[] newTab = new Osoba[zap - 1];
        System.arraycopy(tab, 0, newTab, 0, zap - 1);
        return newTab;
    }
}
