package DSA_JAVA;

public class JosephusProblem {
    public int findTheWinner(int n, int k) {
         int winner = 0;
        for(int i=1; i<=n; i++){
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
    public static void main(String[] args) {
        JosephusProblem js = new JosephusProblem();
        int n = 5;
        int k = 2;
        int result = js.findTheWinner(n, k);
        System.out.println("The real winner is: " + result);
    }
}
