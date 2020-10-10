/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************/
class Employee{
    String name;
    int age;	
    String city;
    public void display(String name,int age,String city){
        System.out.println("The name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("City is:"+city);
    }
}

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Employee e1=new Employee();
		e1.display("Saurabh",23,"Chennai");
		Employee e2=new Employee();
		e2.display("John",20,"Hyderabad");
	}
}
/*OUTPUT


The name is:Saurabh                                                                                                             
Age is:23                                                                                                                       
City is:Chennai                                                                                                                 
The name is:John                                                                                                                
Age is:20                                                                                                                       
City is:Hyderabad  */
