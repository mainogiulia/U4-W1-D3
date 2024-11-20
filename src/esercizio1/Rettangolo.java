package esercizio1;

public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcolaArea() {
        return altezza * larghezza;
    }

    public int calcolaPerimetro() {
        return (altezza + larghezza) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("Altezza: " + altezza);
        System.out.println("Larghezza: " + larghezza);
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
        System.out.println("-------------------------");
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        int sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        int sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
        System.out.println("-------------------------");
    }
}