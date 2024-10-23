import java.util.GregorianCalendar;
import java.util.Objects;

public class Angebot {

    private double regualrpreis;

    private GregorianCalendar flugdatum;

    private String flugnummer;

    private Preisstrategie rabattstrategie;

    public Angebot(double regualrpreis, GregorianCalendar flugdatum, String flugnummer) {
        setRegualrpreis(regualrpreis);
        setFlugdatum(flugdatum);
        setFlugnummer(flugnummer);
    }

    public void rabattstrategieWählen(){
        int monat = flugdatum.get(GregorianCalendar.MONTH);


        if (monat == 1 || monat == 4 || monat == 10) {
            rabattstrategie = new MaxiDiscount();
        } else if (monat == 2 || monat == 3) {
            rabattstrategie = new MidiDiscount();
        } else {
            rabattstrategie = new ZeroDiscount();
        }
    }

    public double getRegualrpreis() {
        return regualrpreis;
    }

    public void setRegualrpreis(double regualrpreis) {
        if (regualrpreis <= 0){
            this.regualrpreis = regualrpreis;
        }else {
            throw new RuntimeException("Der Preis darf nicht 0 sein");
        }

    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        Objects.requireNonNull(flugdatum);
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        Objects.requireNonNull(flugnummer);
        this.flugnummer = flugnummer;
    }


    public String anzeigen() {
        return "Angebot{" +
                "regualrpreis=" + regualrpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
