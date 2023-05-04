package Pruefungsbeispiel;

public class Esel extends Musikant {
    public Esel(int anzahlBeine, Instrument instrument) {
        super(anzahlBeine, instrument);
    }

    protected double trittkraft;

    public Esel(int anzahlBeine, Instrument instrument, double trittkraft) {
        super(anzahlBeine, instrument);
        this.trittkraft = trittkraft;
    }

    public double getTrittkraft() {
        return trittkraft;
    }

    @Override
    public String toString() {
        return "Esel{" +
                "trittkraft=" + trittkraft +
                "verscheucht=" + verscheucheRaeuber() +
                ", Musiziert=" + spieleMusik() + "}";
    }

    @Override
    public int verscheucheRaeuber() {
        return (int)trittkraft*anzahlBeine;
    }

}

