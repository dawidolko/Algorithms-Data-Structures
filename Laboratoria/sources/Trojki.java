package asd_lab_1;

public class Trojki {
    public static void main(String[] args) { 
        int n = 20;
        int a = 0, b = 0, c = 0;
        for (int x = 1; x <= n; x++) {
            a++;
            for (int y = 1; y <= n; y++) {
                b++;
                for (int z = 1; z <= n; z++) {
                    c++;
                    if (x * x + y * y == z * z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
        System.out.println("\"zlozonosc\":  " + a + " + " + b + " + " + c + " = " + (a + b + c));
    }
}
