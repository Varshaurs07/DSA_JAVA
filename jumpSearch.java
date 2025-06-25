package DSA_JAVA;

public class jumpSearch {
    public static int jumpSearch(int[] arr, int x){
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;
        while(prev < n && arr[Math.min(step,n)-1] < x){
            prev = step;
            step += (int) Math.sqrt(n);
        }
        for(int i=prev; i<Math.min(step,n); i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 20, 25, 30};
        int x = 25;
        int r = jumpSearch(a, x);
        System.out.println(r);
    }
}


