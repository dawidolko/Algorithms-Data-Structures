package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5,6,3,2,8,-4,-9,9,0,1);
        list.addAll(values);

        for (int e : list) System.out.print(e + " ");

        int nElems = list.size();
        mergeSort(0, nElems-1);

        System.out.println();
        for (int e : list) System.out.print(e + " ");
    }

    public static void mergeSort(int left, int right) {
        if (left < right) {
            int center = (left+right)/2;
            mergeSort(left, center);
            mergeSort(center+1, right);
            merge(left, center, right);
        }
    }

    public static void merge(int left, int center, int right) {

        ArrayList<Integer> listP = new ArrayList<>();

        int i=left;
        int j=center+1;

        while ((i<center+1) || (j<right+1)) {

            if (i==center+1) {
                listP.add(list.get(j));
                j++;
            }
            else if (j==right+1) {
                listP.add(list.get(i));
                i++;
            }
            else {

                if (list.get(i)<=list.get(j)) {
                    listP.add(list.get(i));
                    i++;
                } else {
                    listP.add(list.get(j));
                    j++;
                }

            }

        }

        int l = left;
        for (int i2=0;i2<listP.size();i2++) {
            list.set(l, listP.get(i2)); l++;
        }
    }
}