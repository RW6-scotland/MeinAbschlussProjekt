import java.util.Objects;

public class RabattStrategie{

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
}
