import java.util.*;


public class bit_2 {
    public static void main(String[] args) {
        // Write a program to find if a number is a power of 2 or not.
            //For example: 8 is a power of two = 2³ 12 is not a power of two since there exists no x such that 2^x = 8.
        // Step 1: Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // // Step 2: Check if the number is a power of 2
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
      

        // // Step 3: Function to check power of 2 using bitwise operation
        public static boolean isPowerOfTwo(int n) {
            if (n <= 0) return false; // Negative numbers and zero are not powers of 2
            return (n & (n - 1)) == 0;
        }
        
        
        // Write a program to toggle a bit a position = “pos” in a number “n”.

        // int x = (int) Math.pow(5, 2);
        
        // int a = 5*5;
        // System.out.println(x);
        // System.out.println(a);
        
        // Write a program to count the number of 1’s in a binary representation of the number.
        int count = 0 ;
        int n = 1101;
        for (int i=0 ; i<=5 ; i ++){
            if ( n == 1){
                count +=1;
            }
        }
        System.out.println(count);

        // Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. 

    }
}
