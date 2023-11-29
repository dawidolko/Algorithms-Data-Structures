package asd_lab_1;

public class A24 {

    final static int MAX = 1000000;
    static boolean thousand, tenthousand, hundredthousand, million;

    public static void rozrod(int bakterii, int minuty) {

        if (bakterii>1000 && !thousand) {
            thousand=true;
            System.out.println("Tysiac razy: po " + minuty + " minutach");
        }

        if (bakterii>10000 && !tenthousand) {
            tenthousand=true;
            System.out.println("Dziesięc tysięcy razy: po " + minuty + " minutach");
        }

        if (bakterii>100000 && !hundredthousand) {
            hundredthousand=true;
            System.out.println("Sto tysięcy razy: po " + minuty + " minutach");
        }

        if (bakterii>1000000 && !million) {
            million=true;
            System.out.println("Milion razy: po " + minuty + " minutach");
            return;
        }

        rozrod(2*bakterii, minuty+2);
    }

    public static void main(String[] args) {
        rozrod(1, 0);
    }
}
