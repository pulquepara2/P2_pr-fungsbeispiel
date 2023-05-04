package Pruefungsbeispiel;

public class Katze extends Musikant {
    public Katze(int anzahlBeine, Instrument instrument) {
        super(anzahlBeine, instrument);
    }
    protected double kratzKraft;

    public Katze(int anzahlBeine, Instrument instrument, double kratzKraft) {
        super(anzahlBeine, instrument);
        this.kratzKraft = kratzKraft;
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public String toString() {
        return "Katze{" +
                "kratzKraft=" + kratzKraft +
                "verscheucht=" + verscheucheRaeuber()+
                ", Musiziert=" + spieleMusik()+"}";
    }
}
