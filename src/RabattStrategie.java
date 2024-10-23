import java.util.Objects;

public abstract class RabattStrategie{

    private String bezeichnung;

    public RabattStrategie(String bezeichnung) {
        setBezeichnung(bezeichnung);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Objects.requireNonNull(bezeichnung);
        this.bezeichnung = bezeichnung;
    }

    public abstract double getReduzierterPreis(double preisOhneNachlass);

    @Override
    public String toString() {
        return bezeichnung;
    }
}
