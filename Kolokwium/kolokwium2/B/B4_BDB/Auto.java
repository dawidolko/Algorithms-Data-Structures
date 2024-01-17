package B.B4_BDB;
public class Auto {
    private String name; // Prywatne pole przechowujące nazwę samochodu
    private double engine; // Prywatne pole przechowujące informację o silniku samochodu
    public Auto(String nazwa, double engine) { // Konstruktor klasy Auto
        this.name = nazwa; // Inicjalizacja nazwy samochodu
        this.engine = engine; // Inicjalizacja informacji o silniku samochodu
    }
    public String getNazwa() { // Metoda do pobierania nazwy samochodu
        return name;
    }
    public void setNazwa(String nazwa) { // Metoda do ustawiania nazwy samochodu
        this.name = nazwa;
    }
    public double getEngine() { // Metoda do pobierania informacji o silniku samochodu
        return engine;
    }
    public void setEngine(double engine) { // Metoda do ustawiania informacji o silniku samochodu
        this.engine = engine;
    }
    public String toString() { // Metoda toString do generowania reprezentacji tekstowej obiektu Auto
        return "Auto{" +
                "nazwa='" + name + '\'' + // Dodawanie nazwy do reprezentacji tekstowej
                ", engine=" + engine + // Dodawanie informacji o silniku do reprezentacji tekstowej
                '}';
    }
}
