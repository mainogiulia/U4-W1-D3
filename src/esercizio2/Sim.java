package esercizio2;

public class Sim {
    private String numeroTelefono;
    private int credito;
    private Chiamata[] ultimeChiamate;
    private int numeroChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime 5 chiamate:");
        for (int i = 0; i < numeroChiamate; i++) {
            System.out.println("Chiamata " + (i + 1) + ": " + ultimeChiamate[i].getNumeroChiamato() + " - Durata: " + ultimeChiamate[i].getDurata() + " minuti");
        }
    }

    public void aggiungiChiamata(String numeroChiamato, int durata) {
            ultimeChiamate[numeroChiamate] = new Chiamata(numeroChiamato, durata);
            numeroChiamate++;
    }

    private class Chiamata {
        private String numeroChiamato;
        private int durata;

        public Chiamata(String numeroChiamato, int durata) {
            this.numeroChiamato = numeroChiamato;
            this.durata = durata;
        }

        public String getNumeroChiamato() {
            return numeroChiamato;
        }

        public int getDurata() {
            return durata;
        }
    }
}