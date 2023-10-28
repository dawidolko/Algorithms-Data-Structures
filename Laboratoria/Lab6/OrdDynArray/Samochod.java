package OrdDynArray;

public class Samochod implements Comparable<Samochod> {
    private String marka, model;
    private int przebieg;

    public Samochod() {
        this.marka = "";
        this.model = "";
        this.przebieg = 0;
    }

    public Samochod(String marka, String model, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", przebieg=" + przebieg +
                '}';
    }


    public int compareTo(Samochod sam) {
        //Przebieg najmniejszy
        //Marka alfabetycznie
        //Model alfabetycznie

        if (this.getPrzebieg()>sam.getPrzebieg()) return 1;
        if (this.getPrzebieg()<sam.getPrzebieg()) return -1;
        if (this.getPrzebieg()==sam.getPrzebieg() && !this.getMarka().equals(sam.getMarka())) return this.getMarka().compareTo(sam.getMarka());
        if (this.getPrzebieg()==sam.getPrzebieg() && this.getMarka().equals(sam.getMarka())) return this.getModel().compareTo(sam.getModel());
        return 0;
    }
}
