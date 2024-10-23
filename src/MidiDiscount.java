import java.time.LocalDate;

public class MidiDiscount extends RabattStrategie{

    public MidiDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double preisOhneNachlass) {
        return preisOhneNachlass * 0.85;
    }
}
