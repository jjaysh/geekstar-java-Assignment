public class Person {
    // fields
   String name;
   String email;
   int age;
   int phoneNumber;

   // constructor
   Person(){
    this.name = "Rohan";
    this.email = "Rohanmane455@gmail.com";
    this.age = 3;
    this.phoneNumber = 9765896;

   }
   public Person(String theName)
   {
      this.name = theName;
   }
   public Person(String theName, int theage)
   {
      this.name = theName;
      this.age = theage;
   }
   public Person(String theName, int theage, String theEmail)
   {
      this.name = theName;
      this.age = theage;
      this.email = theEmail;
   }
   public Person(String theName, int theage, String theEmail, int thephoneNumber)
   {
      this.name = theName;
      this.age = theage;
      this.email = theEmail;
      this.phoneNumber = thephoneNumber;
   }

   // methods - getters
   public String getName() { return this.name;}
   public int getage() { return this.age;}
   public String getEmail() { return this.email;}
   public int getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setage(int theage) { this.age = theage;}
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(int thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
	   Person p = new Person("Ram");
           System.out.println(p);
          
	   Person p1  = new Person();
           System.out.println(p1.getName());
	   System.out.println(p1.getage());  
           System.out.println(p1.getEmail());  
	   System.out.println();

           Person p2  = new Person();
           p2.setName("Ram");
	   p2.setage(5);
	   p2.setEmail("ram123@gmail.com");
           p2.setPhoneNumber(9765896);
           System.out.println(p2.getName());
	   System.out.println(p2.getage());
           System.out.println(p2.getEmail());
           System.out.println(p2);  
		  
   }
    
}


/*-----output-----
Ram null 0
Rohan
3
Rohanmane455@gmail.com

Ram
5
ram123@gmail.com
Ram ram123@gmail.com 9765896
-----*/
