public class ArrayAddition {

	public static void main(String[] args) {
		int[][] a = {{8,76,54},{36,12,97},{45,89,67}};
		int[][] b = {{10,25,75},{86,42,54},{23,87,56}};   
		int[][] aar = new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				arr[i][j] = a[i][j] + b[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}