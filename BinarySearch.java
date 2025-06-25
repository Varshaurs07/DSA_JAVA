package DSA_JAVA;

import java.util.*;
public class BinarySearch {
    public static int binarySear(int a[], int l, int h, int key){
        if(l<=h){
            int mid = (l+h)/2;
            for(int i=0; i<h; i++){
            if(key == a[mid]){
                return mid;
            } else if( key < a[mid]){
                return binarySear(a,l,mid-1,key);
            } else {
                return binarySear(a, mid+1, h, key);
            }
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10};
        int key = 6;
        int l = 0;
        int h = a.length;
        int result = binarySear(a,l, h, key);
        if(result != -1){
        System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
