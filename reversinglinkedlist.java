package DSA_JAVA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
public class reversinglinkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));   
        System.out.println("Original List: " + list1);
        Collections.reverse(list1);
        System.out.println("First reverse: " + list1);
        ArrayList<Integer> reversedList = new ArrayList<>();
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            int curr = itr.next();
            reversedList.add(0,curr);
        }
    System.out.println("Reversed List: " + reversedList);
    }
}
