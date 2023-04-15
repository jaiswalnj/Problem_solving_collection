package Recursion;
import java.util.Scanner;

class find_number_of_ways{
    static int count(int n,int m){
        if(n==1||m==1) return 1;
        return (count(n-1,m)+count(n,m-1));
    }
    public static void main(String[] args){
        System.out.println("Enter size of matrix");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println("total no. of ways ="+count(n,m));
    }
}