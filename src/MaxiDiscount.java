import java.time.LocalDate;

public class MaxiDiscount extends  Preisstrategie{


    @Override
    public double getReduzierterPreis() {
        return getStandartPreis() * 0.70;
    }


}
