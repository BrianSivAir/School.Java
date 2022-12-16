package it.brian.school.cli.oop.ristorante;

public class Ordine {
    private String tavolo;
    private String ordine;

    public Ordine(String tavolo, String ordine) {
        this.tavolo = tavolo;
        this.ordine = ordine;
    }

    public String getTavolo() {
        return tavolo;
    }

    public String getOrdine() {
        return ordine;
    }

    public void dump() {
        System.out.println("-------------------------");
        System.out.println("Tavolo          : " + tavolo);
        System.out.println("Ordine          : " + ordine);
        System.out.println("-------------------------");
    }
}
