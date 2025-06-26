package DSA_JAVA;

public class twononrepeatingnumber {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 3, 2, 1};
        int res = 0;
        for(int num : a){
            res ^= num;
        }
            int rightmostbit = res & -res;
            int num1 = 0 , num2 = 0;
            for(int num : a){
                if((num & rightmostbit) == 0)
                    num1 ^= num;
                else
                    num2 ^= num;

            }
            System.out.println("The two unique elements are: " + num1 + " and " +num2);
            }
        }
        

