package Pruefungsbeispiel;

public class Hahn extends Musikant{
    public Hahn(int anzahlBeine, Instrument instrument) {
        super(anzahlBeine, instrument);
    }
    protected int flugweite;

    public Hahn(int anzahlBeine, Instrument instrument, int flugweite) {
        super(anzahlBeine, instrument);
        this.flugweite = flugweite;
    }

    public int getFlugweite() {
        return flugweite;
    }

    @Override
    public String toString() {
        return "Hahn{" +
                "flugweite=" + flugweite +
                "verscheucht=" + verscheucheRaeuber()+
                ", Musiziert=" + spieleMusik()+"}";
    }

    @Override
    public int verscheucheRaeuber() {
        return 0;
    }

    @Override
    public double spieleMusik() {
        return 0;
    }
}
