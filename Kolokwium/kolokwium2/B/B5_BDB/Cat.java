package B.B5_BDB;
public class Cat {
    private String name;   // Prywatne pole przechowujące nazwę kota
    private double weight; // Prywatne pole przechowujące wagę kota
    public Cat(String name, double weight) {
        this.name = name;       // Inicjalizacja nazwy kota
        this.weight = weight;   // Inicjalizacja wagi kota
    }
    public String getName() {
        return name; // Pobieranie nazwy kota
    }
    public void setName(String name) {
        this.name = name; // Ustawianie nazwy kota
    }
    public double getWeight() {
        return weight; // Pobieranie wagi kota
    }
    public void setWeight(double weight) {
        this.weight = weight; // Ustawianie wagi kota
    }
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
