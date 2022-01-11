import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
             if(j<=i)
             System.out.print(j+"\t");
             else 
             System.out.print("\t");
         } 
         for(int k=n-1;k>=1;k--) 
         {  if(k<=i)
            System.out.print(k+"\t");
            else
            System.out.print("\t");
         }
         System.out.println();
     }

 }
}
