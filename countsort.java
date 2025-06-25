package DSA_JAVA;

public class countsort {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 3, 4, 1, 6, 4, 3};
        int max = a[0];
        for(int num : a){
            if(num > max){
                max = num;
            }
        }
        int count[] = new int[max + 1];
        for(int num : a){
            count[num]++;
        }
        int index = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[index++] = i;
                count[i]--;
            }
        }
        System.out.println("Counting Sort: ");
        for(int num : a){
            System.out.println(num + " ");
        }
    }
}
