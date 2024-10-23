public class ZeroDiscount extends Preisstrategie{

    @Override
    public double getReduzierterPreis() {
        return getStandartPreis();
    }
}
