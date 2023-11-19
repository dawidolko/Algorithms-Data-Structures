// 1 Zadanie

public class kolokwium1v1z1 {

    public static int wyraz(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return 3*wyraz(n-1)*wyraz(n-2);
        }
    }

    public static void main(String[]args){
        int n=5;
        int odpowiedz = wyraz(5);
        System.out.println(odpowiedz);
    }
}
