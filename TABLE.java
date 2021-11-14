import java.util.Scanner;
public class TABLE {

    public static void main(String[] args) {
        
        System.out.println("***********************TABLE******************");
       
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter first number = ");
        int n=sc.nextInt();
        
        
        for(int i=1;i<=10;i++)
        {
            
            System.out.println( n+  " x " +  i + " = "+n*i);
        } 
      // sc.close();
      
{
    System.out.println("***********************SWAP****************************");
    System.out.print("Enter first number = ");
    int num1=sc.nextInt();
    System.out.print("Enter Secound number = ");
     int num2=sc.nextInt();

     System.out.println("no befour swap "+num1+"  " + num2);

     num1=num1+num2;
     num2=num1-num2;
     num1=num1-num2;
     System.out.println("no after swap "+num1+"   " + num2);

}
System.out.println("***********************SWAP2****************************");

System.out.print("Enter first number = ");
int num3 =sc.nextInt();

System.out.print("Enter Secound number = ");
int num4=sc.nextInt();
int temper;
System.out.println("no befour swap "+num3+"  " + num4);
 temper = num3;
 num3=num4;
 num4=temper; 
 System.out.println("no after swap "+num3+"   " + num4);


{

System.out.println("***********************FACTORIAL****************************");

System.out.print("Enter any no for factorial = ");
int fact=1;
int a = sc.nextInt();
//int a=5;



for(int b=1;b<=a;b++)
{
 fact=fact*b;
}
System.out.print("Factorial of "+a+" is "+fact);
System.out.println();
}

System.out.println("***********************Sum of n numbers using for loop****************************");
int sum5=0;
System.out.print("Enter the Number = ");
int N = sc.nextInt();
for(int i2=1;i2<=N;i2++){
     sum5 = sum5 + i2;
}
System.out.println("Sum of n Number :- "+sum5);

System.out.println("***********************FIBONACII****************************");

System.out.print("Enter the n : ");
int up = sc.nextInt();
int n1 = 0, n2 = 1;
System.out.print(n1 + " " + n2);

for (int i3 = 2; i3 < up; ++i3)
{
    int n3 = n1 + n2;
    System.out.print(" " + n3);
    n1 = n2;
    n2 = n3;
}

}
}

