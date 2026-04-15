import Osoby.Osoba;

public class BuforCykliczny {
    private Osoba[] tab;
    private int ilosc;
    private int glowa;
    private int ogon;
    
    public BuforCykliczny(){
        this.tab = new Osoba[4];
        this.ilosc = 0;
        this.glowa = 0;
        this. ogon = 0;
    }
    public void wypisz(){
        for(int i=0; i<this.tab.length; i++){
            if(this.tab[i]!= null){
                System.out.println(this.tab[i]);
            }
        }
    }
    private void powieksz(){
        int indeks=0;
        Osoba[] tabWieksza = new Osoba[2*this.tab.length];
        while(indeks < this.ilosc){
            tabWieksza[indeks]=tab[(glowa+indeks)%tab.length];
            indeks++;
        }
        this.tab = tabWieksza;
        this.glowa = 0;
        this.ogon = ilosc;
    }
    private void zmniejsz(){
        int indeks=0;
        Osoba[] tabMniejsza = new Osoba[this.tab.length/2];
        while(indeks < this.ilosc){
            tabMniejsza[indeks]=tab[(glowa+indeks)%tab.length];
            indeks++;
        }
        this.tab = tabMniejsza;
        this.glowa=0;
        this.ogon=ilosc;
    }
    public void dodaj(Osoba elem){
        if(this.ilosc==this.tab.length){
            powieksz();
        }
        this.tab[this.ogon]=elem;
        this.ogon = (this.ogon+1)%this.tab.length;
        this.ilosc++;
    }
    public Osoba pobierz(){
        Osoba zwrot = null;
        if(this.ilosc!=0){
            zwrot = tab[glowa];
            this.tab[this.glowa]=null;
            this.ilosc--;
            this.glowa=(this.glowa+1)%this.tab.length;
            if(ilosc*4 < tab.length){
                zmniejsz();
            }
        }
        return zwrot;
    }   
    
}
