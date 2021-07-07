package arrayn;
import java.util.Scanner;
public class INSERT {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Array Length:");
        int n=s.nextInt();
        int a=n+2;
        int[]A=new int[a];
        System.out.print("Enter the Array:");
        for(int i=0;i<n;i++) A[i]=s.nextInt();
        System.out.print("Index:");
        int index=s.nextInt();
        System.out.print("Elemented to be inserted:");
        int number=s.nextInt();
        for(int i=n-1;i>=index;i--){
            A[i+1]=A[i];
        }
        A[index]=number;
        System.out.print("The New Array is:");
        for(int i=0;i<a-1;i++) System.out.print(A[i]+" ");
    }
}
