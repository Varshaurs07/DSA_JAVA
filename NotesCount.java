package DSA_JAVA;

import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] no={1, 2, 5, 10, 50, 100, 500};
        int a = no.length;
        int count[]=new int[n];
        for(int i=a-1;i>=0;i--){
            if(n>=no[i]){
                int x=n/no[i];
                count[i]=x;
                n-=x*no[i];
            }
        }
        int note = 0;
         for(int i=0;i<no.length;i++){
            System.out.println(count[i]);
            note+=count[i];
         }
         System.out.println("Number of notes: " + note);
    }
}

