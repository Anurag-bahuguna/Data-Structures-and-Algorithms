import java.util.*;


public class bit_2 {
    public static void main(String[] args) {        
        // Write a program to toggle a bit a position = “pos” in a number “n”.

        int x = (int) Math.pow(5, 2);
        
        int a = 5*5;
        System.out.println(x);
        System.out.println(a);
        
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
