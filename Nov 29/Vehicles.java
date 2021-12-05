class Vehicle {
    String model;                                          // instance variable
    int price;
    int tyre;

    Vehicle()                                           //Default Constructor
	{
		this.model="default-name";
		this.tyre=4;
		this.price=120000;
	
	}


	Vehicle(String model, int wheeler, int price)      //Parameterized Constructor
	{
		this.model= model;
		this.tyre= tyre;
		this.price=price;
	}

                                                         	// method to set the variables
	public void setModel(String model) {
		this.model = model;
	}

	public void settyre(int tyre ) {
		this.tyre = tyre;
	}

	public void setPrice(int price) {
		this.price = price;
	}
                                                          // method to retrieve the variables
    public String getModel() {
		return model;
	}
	public int gettyre() {
		return tyre;
	}
	  
	public int getPrice() {
		return price;
	}
     
}
public class Vehicles {
    public static void main(String[] args)                   //main() method
    {
                                                                  //Bike
        System.out.println("--------BIKE--------");
		Vehicle bike  = new Vehicle();
		bike.setModel("Doom");
		bike.settyre(2);
		System.out.println(bike.getModel());  
		System.out.println(bike.gettyre());  
		System.out.println(bike.getPrice());
		System.out.println();
		
	                                                            	//CAR
		System.out.println("--------CAR--------");
		Vehicle car  = new Vehicle();
		car.setModel("Tarzan");
		car.settyre(4);
		System.out.println(car.getModel());  
		System.out.println(car.gettyre());  
		System.out.println(car.getPrice());
		System.out.println();
		
	                                                             	//TRUCK
		System.out.println("--------TRUCK--------");
		Vehicle truck  = new Vehicle();
		truck.setModel("Tampo");
		truck.settyre(6);
		System.out.println(truck.getModel());  
		System.out.println(truck.gettyre());  
		System.out.println(truck.getPrice());
		System.out.println();
    
    }
}


/*  --------output--------
--------BIKE--------
Doom
2
120000

--------CAR--------
Tarzan
4
120000

--------TRUCK--------
Tampo
6
120000

*/
