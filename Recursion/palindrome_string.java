package Recursion;
import java.util.Scanner;

class palindrome{
    static boolean isPalin(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return isPalin(s,l+1,r-1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        if(isPalin(s,0,(s.length()-1))){
            System.out.println("The given String is Palindrome");
        }
        else{
            System.out.println("The given String is Not Palindrome");
        }
    }
}