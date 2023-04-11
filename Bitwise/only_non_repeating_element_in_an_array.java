package Bitwise;
import java.util.Scanner;

public class only_non_repeating_element_in_an_array {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int res=0;
    int arr[]= new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        res=arr[i]^res;
    }
    System.out.println("only non repeating element in an array:"+res);
}
}