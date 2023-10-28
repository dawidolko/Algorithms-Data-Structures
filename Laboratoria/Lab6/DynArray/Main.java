public class Main {
    public static void main(String[] args) {
        Osoba os1 = new Osoba("Krzysztof", "Pazda", 19);
        Osoba os2 = new Osoba("Jan", "Nowak", 41);
        Osoba os3 = new Osoba("Alina", "Flis", 24);

        DynArray array = new DynArray(2);
        array.add(os1);
        array.add(os2);
        array.print1();

        array.add(os3);
        array.print2();

        array.remove(1);
        array.print1();

        System.out.println(array.find1(os3));
        System.out.println(array.find2(os3));
    }
}