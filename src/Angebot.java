import java.time.LocalDate;
import java.util.Objects;

public class Angebot {

    private double regualrpreis;

    private LocalDate flugdatum;

    private String flugnummer;

    public Angebot(double regualrpreis, LocalDate flugdatum, String flugnummer) {
        setRegualrpreis(regualrpreis);
        setFlugdatum(flugdatum);
        setFlugnummer(flugnummer);
    }

    public void rabattstrategieWählen(){

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
}
