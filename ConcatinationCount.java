package DSA_JAVA;

public class ConcatinationCount {
    public static void main(String[] args) {
        int a[] = {5, 15, 25, 35, 45};
        int n = a.length;
        int sum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                String s1 = Integer.toString(a[i]);
                String s2 = Integer.toString(a[j]);
                String s3 = s1.concat(s2);
                sum = Integer.parseInt(s3);
                if(sum>=200 && sum<=2000){
                    count++;
                    System.out.println(a[i] + " " + a[j] + " " + sum);
                }
            }
        }
        System.out.println(count);
    }
}


