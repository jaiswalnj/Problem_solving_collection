package Bitwise;
import java.util.Scanner;

class Solution{
    public static int rmsetbitposition(int n){
        int count =0;
        if((n & 1) != 0) return 1;
            int andop = n & (n-1);
            int xor = n ^ andop;
            while (xor > 0) {
                xor = xor >> 1;
                ++count;
            }
            return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int ans=rmsetbitposition(num);
        System.out.println("Position of first set bit is : "+ans);
    }
}