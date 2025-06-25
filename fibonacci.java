package DSA_JAVA;

import java.util.*;
public class fibonacci {
    public static int fib(int n){
        if (n<=1){
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
        System.out.println(fib(i));
        }
    }
}    

