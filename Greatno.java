import java.util.Scanner;
class Greatno
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first value = ");
        int a = sc.nextInt();
    
        System.out.print("Enter first value = ");
        int b = sc.nextInt();

        System.out.print("Enter first value = ");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("The Greatest Of Three Numbers is a " + a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The Greatest Of Three Numbers is b " + b);
        }
        else
        {
            System.out.println("The Greatest Of Three Numbers is c " + c);
        }
    }
}
 
