class pattern
{
   public static void main(String[] args) {
            int n=5;
            for(int i=0;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            
		for(int f=1;f<=n;f++)
		{
			for(int g=1;g<=n-f;g++)
			{
				System.out.print(" ");
			}
			for(int g=1;g<=f;g++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//Reverse Pyramid
		for(int h=1;h<=n;h++)
		{
			for(int z=1;z<=h;z++)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=n-h;z++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
        

        {
            System.out.println();
            int r=5;
            System.out.println("Reverse Pyramid Number Pattern");
		int counter = 1;
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(counter + " ");
			}
			System.out.println();
			counter = counter + 1;
		}
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
        }
    }
}
