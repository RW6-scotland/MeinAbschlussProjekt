public class ZeroDiscount extends RabattStrategie{


    public ZeroDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double preisOhneNachlass) {
        return preisOhneNachlass;
    }
}
