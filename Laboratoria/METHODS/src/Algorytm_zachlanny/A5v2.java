import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int[][] switchTime = {
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
    };

    static Boolean[] visited = new Boolean[6];
    static ArrayList<Integer> smaki = new ArrayList<>();

    public static void main(String[] args) {
        Arrays.fill(visited,false);
        int czas = 0;
        int aktualnySmak=0;
        visited[0]=true;
        smaki.add(0,0+1);
        wyborSmakow(aktualnySmak,czas);


    }
    public static int wyborSmakow(int aktualnySmak,int czas){
        int minZmiana = Integer.MAX_VALUE;
        int minIndeks = 0;
        for(int i=1;i<switchTime.length;i++){
            minZmiana = Integer.MAX_VALUE;
            for(int j=0;j<switchTime.length;j++){
                if(minZmiana>switchTime[aktualnySmak][j] && switchTime[aktualnySmak][j]!=0 && visited[j]==false){
                    minZmiana = switchTime[aktualnySmak][j];
                    minIndeks = j;
                }
            }
            czas+=minZmiana;
            smaki.add(i,minIndeks+1);
            visited[minIndeks]=true;
            aktualnySmak=minIndeks;
        }
        czas+=switchTime[aktualnySmak][0];
        smaki.add(smaki.size(),1);
        for(int i=0;i<smaki.size();i++){
            System.out.println("Zabrane smaki: "+smaki.get(i));
        }
        System.out.println("czas: "+czas);
        return 0;
    }
}
