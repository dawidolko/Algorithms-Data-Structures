package asd_lab_4.montecarlo;

import java.util.Random;

public class FiguraMC 
{
    public static void main(String[] args) 
    {
        System.out.println("POLE = " + pole(100));
    }
    
    public static double pole(int llos)
    {
        Random los = new Random();
        int licz = 0;
        for (int i = 0; i < llos; i++) 
        {
            double x = los.nextInt(1001)/1000.0;
            double y = los.nextInt(1001)/1000.0;
//            System.out.println("x= "+x+"\ty= "+y);
            if(y <= Math.sin(x))
                licz++;
        }
        return (licz/100.0);
    }
    
}
