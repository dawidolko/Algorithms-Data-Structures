package B.B6_BDB;
public class Cat {
    private String name; // Prywatne pole przechowujące nazwę kota
    private double weight; // Prywatne pole przechowujące wagę kota
    public Cat(String name, double weight) {
        this.name = name; // Konstruktor przyjmujący nazwę i wagę kota i inicjalizujący pola
        this.weight = weight;
    }
    public String getName() {
        return name; // Metoda zwracająca nazwę kota
    }
    public void setName(String name) {
        this.name = name; // Metoda ustawiająca nową nazwę kota
    }
    public double getWeight() {
        return weight; // Metoda zwracająca wagę kota
    }
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}'; // Metoda zwracająca reprezentację tekstową obiektu klasy Cat
    }
    public void setWeight(double weight) {
        this.weight = weight; // Metoda ustawiająca nową wagę kota
    }
}
