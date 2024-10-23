import java.time.LocalDate;
import java.util.Objects;

public class Angebot {

    private double regularpreis;

    private LocalDate flugdatum;

    private String flugnummer;

    private RabattStrategie rabattstrategie;

    public Angebot(double regularpreis, LocalDate flugdatum, String flugnummer) {
        setRegularpreis(regularpreis);
        setFlugdatum(flugdatum);
        setFlugnummer(flugnummer);
        rabattstrategieWählen();
    }

    public void rabattstrategieWählen(){
        int monat = flugdatum.getMonthValue();

        if (monat == 1 || monat == 4 || monat == 10) {
            rabattstrategie = new MaxiDiscount("MaxiDiscount 30%");
        } else if (monat == 2 || monat == 3) {
            rabattstrategie = new MidiDiscount("MidiDiscount 15%");
        } else {
            rabattstrategie = new ZeroDiscount("ZeroDiscount 0%");
        }
    }

    public double getReduzierterPreis() {
        return rabattstrategie.getReduzierterPreis(regularpreis);
    }

    public double getRegularpreis() {
        return regularpreis;
    }

    public void setRegularpreis(double regularpreis) {
        if (regularpreis >= 0){
            this.regularpreis = regularpreis;
        }else {
            throw new RuntimeException("Der Preis darf nicht 0 sein");
        }

    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
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
        return "Angebot{ " + "\n" +
                "Regulärer Preis: " + regularpreis + "\n" +
                "Flugdatum: " + flugdatum.toString() + "\n" +
                "Flugnummer: '" + flugnummer + "'\n" +
                "Rabattstrategie: " + rabattstrategie.toString() + "\n" +
                "Rabattierter Preis: " + getReduzierterPreis() +
                " }" + "\n" +
                "**************************************" + "\n";
    }
}
