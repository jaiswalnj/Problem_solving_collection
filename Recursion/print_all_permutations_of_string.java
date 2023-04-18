package Recursion;
import java.util.Scanner;

public class print_all_permutations_of_string {
    static void Permute(String s,int l,int r){
        if(l==r){
            System.out.println(s);
            return ;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            Permute(s,l+1, r);
            s=swap(s,l,i);
        }
    }
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        Permute(s, 0,(s.length()-1));
    }
}
