package DSA_JAVA;

public class maxsubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -2, 5, 2};
        int n = arr.length;
        int curr_sum = arr[0];
        int max_sum = arr[0];
        for(int i=1; i<n; i++){
            curr_sum = Math.max(arr[i],curr_sum+arr[i]);
            max_sum = Math.max(curr_sum,max_sum);
        }
        System.out.println(max_sum);
    }
}
