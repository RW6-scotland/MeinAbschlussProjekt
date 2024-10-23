public class MaxiDiscount extends  RabattStrategie{


    public MaxiDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double preisOhneNachlass) {
        return preisOhneNachlass * 0.70;
    }
}
