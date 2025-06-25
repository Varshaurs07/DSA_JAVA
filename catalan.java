package DSA_JAVA;

public class catalan {
    public static int cat(int n){
        if(n<=1){
            return 1;
        }
        int result = 0;
        for(int i=0;i<n;i++){
            result += cat(i)*cat(n-1-i);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        catalan  c = new catalan();
        for(int i=0; i<n; i++){
            System.out.println("Catalan number at position" + i + " = " + c.cat(i));
        }
    }
}
  