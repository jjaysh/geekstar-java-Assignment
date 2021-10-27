public class condition_statement
 {
    public static void main(String args[])
    {
        int a = 100;
        int b = 200;

  	// print the greater number	
		if (a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

       //Relation Operator
		System.out.println(100 > 10); //true
		System.out.println(10 > 50); //false
		System.out.println(10 < 50); //true
		System.out.println(100 < 50); //false
		System.out.println(10 == 50); // false
	

		System.out.println(10 != 50); // true


		System.out.println(10 >= 50); // false
		System.out.println(50 >= 50); //true
		System.out.println(100 >= 50); //true


		System.out.println(10 <= 50); // true
		System.out.println(50 <= 50); //true
		System.out.println(100 <= 50); //false
	}

}