package B.B2_BDB;
public class Drink {
    double price; // Cena napoju
    String name;  // Nazwa napoju
    public Drink(double price, String name) {
        this.price = price;  // Inicjalizacja ceny napoju
        this.name = name;    // Inicjalizacja nazwy napoju
    }
    public double getPrice() {
        return price;  // Pobieranie ceny napoju
    }
    public void setPrice(double price) {
        this.price = price;  // Ustawianie ceny napoju
    }
    public String getName() {
        return name;  // Pobieranie nazwy napoju
    }
    public void setName(String name) {
        this.name = name;  // Ustawianie nazwy napoju
    }
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
