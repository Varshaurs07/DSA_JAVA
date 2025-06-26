package DSA_JAVA;

 import java.util.Stack;
public class PalindromeStack {
    public static void main(String[] args) {
        Stack <String> s = new Stack<>();
        s.push("m");
        s.push("a");
        s.push("d");
        s.push("a");
        s.push("m");

        Stack <String> original = new Stack<>();
        original.addAll(s);
        
        if(s.equals(original)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


