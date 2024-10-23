import java.time.LocalDate;

public class MidiDiscount extends Preisstrategie{

    @Override
    public double getReduzierterPreis() {
        return getStandartPreis() * 0.85;
    }
}
