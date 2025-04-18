//Given a signed 32-bit integer x, return x with its digits reversed. 
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

import java.util.Scanner;
public class D2 {
    public static int reverse(int x){
        int result =0;
        while(x!=0){
            int digit=x%10;
            x/=10;
            if(result>Integer.MAX_VALUE/10 || (result >Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10 || (result <Integer.MIN_VALUE/10 && digit<-8)){
                return 0;
            }
            result = result*10+digit;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println(result);
    }
}
