package B.B4_LinkedListQueue;

public class Auto {
    private String name;
    private double engine;

    public Auto(String nazwa, double engine) {
        this.name = nazwa;
        this.engine = engine;
    }

    public String getNazwa() {
        return name;
    }

    public void setNazwa(String nazwa) {
        this.name = nazwa;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String toString() {
        return "Auto{" +
                "nazwa='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
