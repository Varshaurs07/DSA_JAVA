package DSA_JAVA;

import java.util.Stack;
public class OneThreeTwoPattern {
    public static boolean find132pattern(int[] nums){
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i-- ){
            if(nums[i]<third){
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(find132pattern(new int[] {3, 1, 4, 2}));
        System.out.println(find132pattern(new int[] {5, 6, 7, 8}));
        System.out.println(find132pattern(new int[] {4, 3, 6, 2}));
    }
}


