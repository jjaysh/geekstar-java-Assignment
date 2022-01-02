public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,7,11,15};
		int target = 9;
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			
			if(a[start]+a[end]>target){//sum of start and end is greater than target is in left
				end--;	
			}
			else if(a[start]+a[end]<target){//sum of start and end is greater than target is in right
				start++;
			}else {
				System.out.println("Index is: "+(start+1)+" "+"Index is: "+(end+1));
				break;//to cut infinite loop
			}
		
			 
		}
	}

}