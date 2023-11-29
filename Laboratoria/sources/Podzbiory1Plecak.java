package asd_lab_1;

public class Podzbiory1Plecak 
{
    public static void main(String[] args) 
    {
        int[][] przedmioty = {{6,2,3,2,3,1},  // Vi
                              {6,4,5,7,10,2}};  // Wi
        
        int vMax = 10; // maxymalna dopuszczalna objetosc
        int wMax = 0; // poczatkowy stan maksymalnej wartosci przedmiotow
        int vAktual = 0; // objetosc obliczana na biezaco dla dla danego podzbioru przedmiotow
        int wAktual = 0; // wartosc przedmiotow obliczana na biezaco dla danego podzbioru
        
        String podzbior = "{";
        
        int b0, b1, b2, b3, b4, b5;
        for (b0 = 0; b0 <= 1; b0++) 
        {
            for (b1 = 0; b1 <= 1; b1++) 
            {
                for (b2 = 0; b2 <= 1; b2++) 
                {
                    for (b3 = 0; b3 <= 1; b3++) 
                    {
                        for (b4 = 0; b4 <= 1; b4++) 
                        {
                            for (b5 = 0; b5 <= 1; b5++) 
                            {
                                if (b0 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][0];
                                    wAktual = wAktual + przedmioty[1][0];
                                    podzbior = podzbior + " 0";
                                }
                                if (b1 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][1];
                                    wAktual = wAktual + przedmioty[1][1];
                                    podzbior = podzbior + " 1";
                                }
                                if (b2 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][2];
                                    wAktual = wAktual + przedmioty[1][2];
                                    podzbior = podzbior + " 2";
                                }
                                if (b3 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][3];
                                    wAktual = wAktual + przedmioty[1][3];
                                    podzbior = podzbior + " 3";
                                }
                                if (b4 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][4];
                                    wAktual = wAktual + przedmioty[1][4];
                                    podzbior = podzbior + " 4";
                                }
                                if (b5 == 1) 
                                {
                                    vAktual = vAktual + przedmioty[0][5];
                                    wAktual = wAktual + przedmioty[1][5];
                                    podzbior = podzbior + " 5";
                                }
                                
                                if(vAktual <= vMax && wAktual >=wMax)
                                {
                                    wMax = wAktual;
                                    System.out.println(podzbior + "} v = " + vAktual + " w = " + wAktual);
                                }

                                vAktual = 0;
                                wAktual = 0;
                                podzbior = "{";
                            }
                        }
                    }
                }
            }
        }
    }
}
