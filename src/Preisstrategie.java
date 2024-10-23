import java.time.LocalDate;

public abstract class Preisstrategie {

    private double standartPreis;

    private LocalDate flugDatum;

    private String flugnummer;


    public double getStandartPreis(){
        return standartPreis;
    }

    public abstract double getReduzierterPreis();
}
