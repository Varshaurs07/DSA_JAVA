package DSA_JAVA;

import java.util.ArrayList;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.addFirst(5);
        System.out.println("Insertion at beg: " + list);
        list.addLast(50);
        System.out.println("Insertion at the lasty: " + list);
        list.set(2,15);
        System.out.println("Insertion at the pos 2: " + list);
        for(int val : list){
            System.out.println(val);
        }
        list.removeFirst();
        System.out.println("Deletion at the first: " + list);
        list.removeLast();
        System.out.println("Deletion at the last: " + list);
        list.remove(1);
        System.out.println("Deletion at the pos 1: "+ list);
    }
}
