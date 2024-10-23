import java.time.LocalDate;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {

        Angebot april = new Angebot(100, LocalDate.of(2024, 4, 1), "AS123");
        System.out.println(april.anzeigen());

        Angebot februar = new Angebot(100, LocalDate.of(2024, 2, 1), "AS123");
        System.out.println(februar.anzeigen());

        Angebot dezember = new Angebot(100, LocalDate.of(2024, 12, 1), "AS123");
        System.out.println(dezember.anzeigen());


    }
}