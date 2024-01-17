package A.A1_BDB;
// Klasa Point reprezentuje punkt w przestrzeni dwuwymiarowej.
public class Point {
    private double x, y; // Prywatne pola przechowujące współrzędne punktu.
    private String nazwa; // Prywatne pole przechowujące nazwę punktu.
    // Konstruktor klasy Point, inicjuje obiekt punktu przyjmując współrzędne x, y oraz nazwę.
    public Point(double x, double y, String nazwa) {
        this.x = x;
        this.y = y;
        this.nazwa = nazwa;
    }
    // Metoda getX() zwraca współrzędną x punktu.
    public double getX() {
        return x;
    }
    // Metoda setX() ustawia nową wartość współrzędnej x punktu.
    public void setX(double x) {
        this.x = x;
    }
    // Metoda getY() zwraca współrzędną y punktu.
    public double getY() {
        return y;
    }
    // Metoda setY() ustawia nową wartość współrzędnej y punktu.
    public void setY(double y) {
        this.y = y;
    }
    // Metoda getNazwa() zwraca nazwę punktu.
    public String getNazwa() {
        return nazwa;
    }
    // Metoda setNazwa() ustawia nową nazwę punktu.
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    // Przesłonięta metoda toString() zwraca reprezentację tekstową punktu w postaci "Point{x=wartość_x, y=wartość_y} nazwa: nazwa".
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}' + " nazwa: " + nazwa;
    }
}
