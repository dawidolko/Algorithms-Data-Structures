package A.A2_OrdDynArray;

public class Person implements Comparable<Person> {
    private String name;
    private int pesel;

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pesel=" + pesel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Person(String name, int pesel) {
        this.name = name;
        this.pesel = pesel;
    }


    public int compareTo(Person o) {
        //pesel malejaco
        //name alfabetyczne

        if (pesel>o.getPesel()) return 1;
        else if (pesel<o.getPesel()) return -1;
        else if (pesel==o.getPesel() && !name.equals(o.getName())) return name.compareTo(o.getName());
        return 0;
    }
}
