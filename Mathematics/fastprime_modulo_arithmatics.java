package Mathematics;

import java.util.Scanner;

class  moduloarithmatics{
    public static long fastprime(long a,long b,int n){
        long res=1;
        while (b>0){
            if((b&1)!=0){
                res=(res*a%n)%n;
            }
            a=(a%n * a%n)%n;
            b=b>>1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Please provide the range");
        long a=inp.nextLong();
        long b=inp.nextLong();
        System.out.println("Please provide value of n");
        int n=inp.nextInt();
        long tp=fastprime(a, b, n);
        System.out.println("total no. of prime in given range ="+tp+"x"+n);
    }
}