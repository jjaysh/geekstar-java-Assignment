import java.util.Scanner;


public class primeno
 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any no to check prime or not = ");
         int n = sc.nextInt();
         int temp=0;

         for(int i=2;i<n;i++)
         {
           if(n % i == 0)
           {
            temp=temp+1;
           }
         }
        if(temp>0)
        {
            System.out.print(n+" is not prime no");
        }
        else
        {
            System.out.print(n+" is a prime no");
        }
         
         
     }
 }
