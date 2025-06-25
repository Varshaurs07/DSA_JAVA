package DSA_JAVA;

public class interpolation1 {
    public static int interpolationSearch(int arr[], int x){
        int low = 0, high = arr.length-1;
        while(low<=high && x >= arr[low] && x <= arr[high]){
            int pos = low + ((x - arr[low]) * (high - low))/(arr[high] - arr[low]);
            if(arr[pos] == x)
                return pos;
                else if(arr[pos] < x)
                    low = pos + 1;
                    else
                        high = pos - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 20, 25, 30};
        int x = 25;
        int r = interpolationSearch(a, x);
        System.out.println(r);
    }
}
