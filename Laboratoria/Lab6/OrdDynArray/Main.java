package OrdDynArray;

public class Main {
    public static void main(String[] args) {
        Samochod sam1 = new Samochod("Volvo", "Rexct", 100211);
        Samochod sam2 = new Samochod("Opel", "Astera", 99912);
        Samochod sam3 = new Samochod("Audi", "A43", 100000);

        OrdDynArray array = new OrdDynArray(2);

        array.add(sam1);
        array.add(sam2);
        array.print1();

        array.add(sam3);
        array.print2();

        array.remove(1);
        array.print2();

        System.out.println(array.find1(sam1));
        System.out.println(array.find2(sam2));
    }
}
