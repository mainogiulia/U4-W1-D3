import esercizio1.Rettangolo;
import esercizio2.Sim;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 3);
        Rettangolo rettangolo2 = new Rettangolo(7, 4);

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

        Sim sim = new Sim("3456789012");
        sim.aggiungiChiamata("3214567890", 5);
        sim.aggiungiChiamata("9876543210", 3);
        sim.aggiungiChiamata("6472734526", 12);
        sim.aggiungiChiamata("2736546272", 21);
        sim.aggiungiChiamata("8464536289", 10);
        sim.stampaDati();
    }
}