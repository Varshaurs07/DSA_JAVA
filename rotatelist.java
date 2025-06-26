package DSA_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class rotatelist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int k = 2;
        Collections.rotate(list1, k);
        System.out.println(list1);
    }
}


