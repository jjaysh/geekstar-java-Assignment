import java.util.Scanner;

public class Nov23assingment {
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);

// WAP to find first index at which element is present in array
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
        {
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
			
			
			System.out.println("number"+arr[0]);
		}


 // WAP to find last index at which element is present in array
        for(int i=0;i<arr.length;i++)
        {
			System.out.println(arr[i]);
			break;
		}
		
		int arr2[]= {2,4,5,6,4,3,5,55,66};
		int n=arr2.length-1;
		
		for(int i=0;i<arr2.length;i++)
        {
			if(i==n)
            {
				System.out.println(arr2[i]);
				
			}
		}

 
// WAP to find difference in 2 arrays
		System.out.print("enter the binary number");
		int binary=sc.nextInt();
		int d=0;
		int n1=1;
		while(true) {
			if(binary==0) {
				break;
				
			}else {
				int temp=binary%10;
				d+=temp*Math.pow(2,n1);
				binary=binary/10;
				n1++;	
			}
		}
		System.out.print("decimal number"+d);
		

// WAP to convert binary number to decimal"
		int[] a1= {1,2,3,4,5,7,6};
		int[] b1= {1,2,3,54,5,6,7};
		if(a1==b1)
        {
			System.out.print("both are equal");
			
		}
        else
        {
			System.out.print("both are not equal");
		}
        sc.close();
	
	}
}