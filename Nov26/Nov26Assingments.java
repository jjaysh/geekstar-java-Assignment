import java.util.Scanner;

public class Nov26Assingments {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] arr=new int[2][2];
		
		System.out.print("enter the no = ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		// lower triangular matrix
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j && arr[i][j]!=1) {
					flag=false;
					break;
					
				}else if(i!=j && arr[i][j]!=0) {
					flag =false;
					break;
				}
			
				
			}
			if(flag=false) {
				break;
			}
		}
		if(flag) {
			System.out.println("unit matrix");
		}else {
			System.out.println("not a unit matrix");
		}


		// Determine if a given Matrix is a Sparse Matrix
		System.out.print("enter the rows");
		int p=sc.nextInt();
		System.out.print("enter the coloum");
		int q=sc.nextInt();
		int[][] matrix=new  int[p][q];
		
		
		if(p==q) {
			System.out.println("square matrix");
		}else {
			System.out.println("not a square matrix");
		}
		
		
		// Find the Frequency of Odd & Even Numbers in the given Matrix"
		boolean t=true;
		System.out.println(t);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i<j) {
					if(arr[i][j]!=0) {
						t=false;
						break;
					}
				}
			}
			if(t=false) {
				break;
			}
			
		}
		if(t)
        {
			System.out.print("triangular");
		}else
        {
			System.out.print(t);
		}
		
    }

}