public class Greatest_Of_Three_Numbers
{
    public static void main(String args[])
    {
      int a=10;
      int b=20;
      int c=30;
      
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