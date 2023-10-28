package asd_lab_3.dynamiczne;

class FiboDyn 
{

    public static void main(String[] args) 
    {
        final int N = 5; // n-ty wyraz ciagu
        System.out.println(fibo(N));
    }

    static int fibo(int n) 
    {
        int[] tab = new int[n + 1];
        tab[1] = 1;
        tab[2] = 1;
        for (int i = 3; i < tab.length; i++) 
        {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        
        return tab[tab.length - 1];
    }
}