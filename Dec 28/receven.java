public class receven{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	displayEvenNumbers(76);   
	  
		
		
	}
	
	private static void displayEvenNumbers(int number){   
		
	if(number>=2)   
	return;   
	if(number%2==0){   
		
	//prints the even numbers  
	System.out.print(number +" "); 
	
	//calling the method and decrement the number by 2 if the number is even  
	displayEvenNumbers(number -2);   
	System.out.print(number);
	}else{   
	//decrement the number by 1 if the number is odd  
	displayEvenNumbers(number-1);
	System.out.print(number);
	}   
	}  
	
	}  


