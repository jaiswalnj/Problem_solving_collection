package Recursion;
import java.util.Scanner;

public class josephus_problem {
    static int jos(int n,int k){
        if(n==1) return 0;
        return((jos(n-1,k)+k)%n);
    }
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter total no. of people ");
        int n= inp.nextInt();
        System.out.println("Enter the gap");
        int k = inp.nextInt();
        System.out.println(jos(n,k)+"  guy will remain alive");
    }
}
