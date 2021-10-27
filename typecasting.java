public class typecasting
 {
    public static void main(String args[])
    {   //----------Widening Casting(Automatically)---------
        byte age = 22;
        System.out.println("Age is "+age);
         int new_age = 22;
        System.out.println("Age is "+new_age);

        int salary = 30000;
        System.out.println("salary is "+salary);
        short new_salary = 30000;
        System.out.println("new_salary is "+new_salary);

        //---------narrowing Casting(manually)-----------
        float percentage = 88.64f;
        System.out.println("percentage is "+percentage);
        int new_percentage = (int) percentage;//output-88
        System.out.println("new_percentage is "+new_percentage);
        
        double myDouble=9.78d;
        System.out.println(myDouble);
        int my_int = (int) myDouble;
        System.out.println(my_int);
    
    
    
    
    }
 }