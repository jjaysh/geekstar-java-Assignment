public class loops
{
    public static void main(String[] args)
    {
         System.out.println("************ For loop ********************");
        for(int n=0;n<=10;n++)
        {
            System.out.println(n);
        }
        System.out.println("********************************");
        for(int j=10;j>=0;j--)
        {
            System.out.println(j);
        }
        System.out.println("********************************");
        for(int a=0;a<=10;a=a+2)
        {
            System.out.println(a);
        }
        System.out.println("********************************");
        for(int b=10;b>=0;b=b-2)
        {
            System.out.println(b);
        }
        System.out.println("************** While loop******************");
        
        int i1=1;
        while(i1<=10) {
            System.out.println(i1);
        i1++;
        }
        System.out.println("********************************");

        int e=10;
        while(e>=1)
       {
        System.out.println(e);
        e--;
        }
        System.out.println("********************************");

        int f=0;
        while(f<=10)
       {
        System.out.println(f);
        f=f+2;
        }
        System.out.println("********************************");

        int g=10;
        while(g>=0)
       {
        System.out.println(g);
        g=g-2;
        }
    }
   
    
}
