public class loops
{
    public static void main(String[] args)
    {
         System.out.println("************ For loop ********************");
          System.out.println("************ print no ********************");
        for(int n=0;n<=10;n++)
        {
            System.out.println(n);
        }
        System.out.println("***************print revres no*****************");
        for(int j=10;j>=0;j--)
        {
            System.out.println(j);
        }
        System.out.println("**************even no******************");
        for(int a=0;a<=10;a=a+2)
        {
            System.out.println(a);
        }
        System.out.println("***************rev even no*****************");
        for(int b=10;b>=0;b=b-2)
        {
            System.out.println(b);
        }
        System.out.println("************** While loop******************");
        System.out.println("************ print no ********************");
        
        int i1=1;
        while(i1<=10) {
            System.out.println(i1);
        i1++;
        }
        System.out.println("*************revers no*******************");

        int e=10;
        while(e>=1)
       {
        System.out.println(e);
        e--;
        }
        System.out.println("*************even no*******************");

        int f=0;
        while(f<=10)
       {
        System.out.println(f);
        f=f+2;
        }
        System.out.println("***************revers no *****************");

        int g=10;
        while(g>=0)
       {
        System.out.println(g);
        g=g-2;
        }
        
         System.out.println("**************   Smaller no  ******************");

         System.out.println("Enter a no = ");
        int a1=sc.nextInt();
         System.out.println("Enter another no ");
        int b1=sc.nextInt();
        if(a1<b1) {
			System.out.println("a smaller than b");
		}
		else if(b1<a1) {
			System.out.println("b smaller than a");
		}
		else {
			System.out.println("a equal to b");
		}

    }
   
    
}
