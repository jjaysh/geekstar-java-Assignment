
class Animal {
    static int CountAnimals = 0;                                                              //static variables
    static int age=0;

    public String type;                                                                      // instance variables 
    private String name;
    private String voice;
    private int Legs;
  
    Animal() {
        this("default_type", "dafault_name","default_voice",4);                               //calls constructor 
    } 

     Animal(String type, String name, String voice) {
        this(type, name, voice, 4);                                                                //calls constructor 
        this.type = type;
        this.name = name;
        this.voice = voice;
    }

    Animal(String type, String name, String voice,int Legs) {
        this.type = type;                                                                    
        this.name = name;
        this.voice = voice;
        this.Legs = Legs;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }
    
    

    public static int getCountAnimals() {
        return CountAnimals;
    }

    public static void setCountAnimals(int countAnimals) {
        CountAnimals = countAnimals;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }



    public int getLegs() {
        return Legs;
    }

    public void setLegs(int Legs) {
        Legs = Legs;
    }
    
    
    public static void incrementAge() {                                                                                      //static method 
		System.out.println("age is "+age+" count is "+CountAnimals);
		CountAnimals++;
	}

    public String toString() {
        return "type of animals " +this.type + ", name is " + this.name +  " with " +this.Legs + 
        " legs "+"that "+ this.voice ;

    }

}
 public class Animals {
    public static void main (String [] args)                                                                                 //main() method
    {
	    System.out.println("-----DOG-----"); 
            Animal dog=new Animal("dog","Moti","bark");                                                                          
            Animal.age=15;
	    Animal.incrementAge();
            System.out.println(dog.getType());
	    System.out.println(dog.getName());  
	    System.out.println(dog.getVoice());  
	    System.out.println(dog.getType());
            System.out.println(dog);
	    System.out.println();

            System.out.println("-----CAT-----");
            Animal cat = new Animal();
            cat.setType("cat");                                                                             
            cat.setVoice("Meow");
	    Animal.age=6;
	    Animal.incrementAge();
	    System.out.println(cat.getName());  
	    System.out.println(cat.getVoice());  
	    System.out.println(cat.getType());
            System.out.println(cat);
            System.out.println();
		
            System.out.println("-----ELEPHANT-----");
            Animal elephant=new Animal("elephant","Dumbo","trumpet");                                   
            Animal.age=30;
	    Animal.incrementAge();
            System.out.println(elephant);
            System.out.println();

          
    }    
}

/*-----output-----
-----DOG-----
age is 15 count is 0
dog
Moti
bark
dog
type of animals dog, name is Moti with 4 legs that bark

-----CAT-----
age is 6 count is 1
dafault_name
Meow
cat
type of animals cat, name is dafault_name with 4 legs that Meow

-----ELEPHANT-----
age is 30 count is 2
type of animals elephant, name is Dumbo with 4 legs that trumpet


-----*/