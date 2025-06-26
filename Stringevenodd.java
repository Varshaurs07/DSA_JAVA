package DSA_JAVA;

public class Stringevenodd {
    public static void main(String[] args) {
        int n = 7;
        String[] result = {"even", "odd"};
        System.out.println("The number is: " + result[n & 1]);
    }
}
