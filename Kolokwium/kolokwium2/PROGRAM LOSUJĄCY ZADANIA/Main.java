import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        los_inf_lab_1();
    }

    public static void los_inf_lab_1(){
        ArrayList<String> stud = new ArrayList<>();
        ArrayList<String> zadA = new ArrayList<>();
        ArrayList<String> zadB = new ArrayList<>();

        // 18 / 23 studentow
        stud.add("Abacki Arkadiusz");
        stud.add("Babacki Jacek");
        stud.add("Cabacki Kamil");
        stud.add("Dabacki Zenon");
        stud.add("Ebacki Wiktor");
        stud.add("Fabacki Gustaw");
        stud.add("Gabacki Max");
        stud.add("Habacki Olaf");
        stud.add("Ibacki Arkadiusz");
        stud.add("Jabacki Jacek");
        stud.add("Kabacki Kamil");
        stud.add("Labacki Zenon");
        stud.add("Mabacki Wiktor");
        stud.add("Nabacki Gustaw");
        stud.add("Obacki Max");
        stud.add("Pabacki Olaf");
        stud.add("Rabacki Arkadiusz");
        stud.add("Sabacki Jacek");
//        stud.add("Tabacki Kamil");
//        stud.add("Ubacki Zenon");
//        stud.add("Wabacki Wiktor");
//        stud.add("Ybacki Gustaw");
//        stud.add("Zabacki Max");

        // zadania z czesci A - dla 23 studentow:
        for(int i=1; i<=5; i++) // po 5 egzemplarzy ...
            for(int j=1; j<=6; j++) // ... kazdego z 6 zadan = 30 zadan
                zadA.add(""+j);
        // zmniejszenie mozliwosci wylosowania zadania 5 - zostaje 28 zadan
        zadA.remove("5");
        zadA.remove("5");

        //System.out.println(""+zadA);

        // zadania z czesci B - dla 23 studentow:
        for(int i=1; i<=3; i++) // po 3 egzemplarze ...
            for(int j=1; j<=9; j++) // ... kazdego z 9 zadan = 27 zadan
                if(j != 7) // ale eliminujemy zadanie 7 - zostaja 24 zadania
                    zadB.add(""+j);

        //System.out.println(""+zadB);

        // LOSOWANIE
        Random rand = new Random();
        TreeSet<String> ts = new TreeSet<>();
        while(!stud.isEmpty())
        {
            String s = stud.get(rand.nextInt(stud.size())); // losowanie studenta
            String zA = zadA.get(rand.nextInt(zadA.size())); // losowanie zadania A
            String zB = zadB.get(rand.nextInt(zadB.size())); // losowanie zadania B
            ts.add(s + "\tA: " + zA + "\tB:" + zB); // 'sklejenie' wylosowanych danych
            stud.remove(s); // usuniecie wylosowanego studenta
            zadA.remove(zA); // usuniecie wylosowanego zadania A
            zadB.remove(zB); // usuniecie wylosowanego zadania B
        }

        // WYPISANIE
        for (String next : ts) {
            System.out.println(""+next);
        }
    }
}
