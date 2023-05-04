package Pruefungsbeispiel;

public class Hund extends Musikant{

    public Hund(int anzahlBeine, Instrument instrument) {
        super(anzahlBeine, instrument);
    }

    @Override
    public int verscheucheRaeuber() {

            if (bellLautstaerke > instrument.getLautstaerke()){
                return (int) Math.round(bellLautstaerke);
            }
            else{
                return (int)Math.round(instrument.getLautstaerke());
            }
        }


    @Override
    public double spieleMusik() {
        return 0;
    }

    protected double bellLautstaerke;

    public Hund(int anzahlBeine, Instrument instrument, double bellLautstaerke) {
        super(anzahlBeine, instrument);
        this.bellLautstaerke = bellLautstaerke;
    }


    @Override
    public String toString() {
        return "Hund{" +
                "bellLautstaerke=" + bellLautstaerke +"verscheucht=" + verscheucheRaeuber()+
                ", Musiziert=" + spieleMusik()+"}";

    }





    }

