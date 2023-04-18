package Recursion;
import java.util.Scanner;

public class print_the_powerset_of_string{
    static void Powerset(String s,int i,String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        Powerset(s,i+1,(cur+s.charAt(i)));
        Powerset(s,i+1, cur);
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        Powerset(s,0,"");
    }
}
