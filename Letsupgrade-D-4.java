Questions 1:
create a class avenger with
properties (name,age,power,weapon,planet) and with
functions-getDetails() and displayDetails().
create 5 objects as an array in the main method and call.

SOLUTION:

import java.util.*;

class Avenger{
    String name,power,weapon,planet;
    int age;
    
    Scanner s=new Scanner(System.in);
    
    void getDetails(int i){
        System.out.println("enter the avenger "+(i+1)+" details: ");
        System.out.print("name: ");
        name=s.nextLine();    
        System.out.print("age: ");
        age=s.nextInt();
        System.out.print("power: ");
        s.nextLine();
        power=s.nextLine();
        System.out.print("weapon: ");
        
        weapon=s.nextLine();
        System.out.print("planet: ");
        planet=s.nextLine();
    }
    void display(int i){
        System.out.println("the details of avenger "+(i+1)+" are:");
        System.out.println("name  : "+name+"\nage   : "+ age+"\npower : "+ power+"\nweapon: "+ weapon+"\nplanet: "+planet);
    }
}

public class Avengers_arrayOfObjects
{
	public static void main(String[] args) {
	    Avenger avengers[]=new Avenger[5];
	    for(int i=0;i<5;i++){
	        avengers[i]=new Avenger();
	        avengers[i].getDetails(i);
	        
	    }
	    for(int i=0;i<5;i++)
	        avengers[i].display(i);
	    //avengers[2].display();
	}
}

/*
enter the avenger 1 details: 
name: bruce banner
age: 41
power: hulk
weapon: body
planet: earth
enter the avenger 2 details: 
name: thor odinson
age: 10000
power: god of thunder
weapon: hammer mjolin
planet: asgard
enter the avenger 3 details: 
name: steve rogers
age: 95
power: captain america
weapon: shield
planet: earth
enter the avenger 4 details: 
name: natasha romanoff
age: 35
power: black widow
weapon: baton and taser
planet: earth
enter the avenger 5 details: 
name: clint barton
age: 45
power: hawkeye
weapon: bow and arrow
planet: earth
the details of avenger 1 are:
name  : bruce banner
age   : 41
power : hulk
weapon: body
planet: earth
the details of avenger 2 are:
name  : thor odinson
age   : 10000
power : god of thunder
weapon: hammer mjolin
planet: asgard
the details of avenger 3 are:
name  : steve rogers
age   : 95
power : captain america
weapon: shield
planet: earth
the details of avenger 4 are:
name  : natasha romanoff
age   : 35
power : black widow
weapon: baton and taser
planet: earth
the details of avenger 5 are:
name  : clint barton
age   : 45
power : hawkeye
weapon: bow and arrow
planet: earth

*/


Questions 2:
Create an int array with 5 values and print only odd values.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
		    System.out.println("Enter the "+(i+1)+ " element");
		    arr[i]=s.nextInt();
		   // if((arr[i]%2)!=0)
		           // System.out.println(arr[i]);
		}
		System.out.println("Odd numbers in the array are:");
		for(int i=0;i<5;i++){
		    if((arr[i]%2)!=0)
		            System.out.println(arr[i]);
		}
		
	}
}
/*OUTPUT:
Enter the 1 element                                                                                                             
68                                                                                                                              
Enter the 2 element                                                                                                             
39                                                                                                                              
Enter the 3 element                                                                                                             
77                                                                                                                              
Enter the 4 element                                                                                                             
93                                                                                                                              
Enter the 5 element                                                                                                             
52                                                                                                                              
Odd numbers in the array are:                                                                                                   
39                                                                                                                              
77                                                                                                                              
93          



Enter the 1 element                                                                                                             
1087                                                                                                                            
Enter the 2 element                                                                                                             
2984                                                                                                                            
Enter the 3 element                                                                                                             
3073                                                                                                                            
Enter the 4 element                                                                                                             
45555                                                                                                                           
Enter the 5 element                                                                                                             
5665                                                                                                                            
Odd numbers in the array are:                                                                                                   
1087                                                                                                                            
3073                                                                                                                            
45555                                                                                                                           
5665              

*/



Questions 3:
Create an int array of size 5, take all the values from the user, add all the values and print the sum.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements of the array");
	int n=s.nextInt();
	int sum=0;
	int arr[]=new int[n];
	 for(int i=0;i<n;i++){
	     System.out.println("Enter the " +(i+1)+ " element");
	     arr[i]=s.nextInt();
	     sum=sum+arr[i];
	 }
	     System.out.println("The sum of the array elements is :" +sum);
	}
}
/*OUTPUT

Enter the number of elements of the array                                                                                       
5                                                                                                                               
Enter the 1 element                                                                                                             
5                                                                                                                               
Enter the 2 element                                                                                                             
7                                                                                                                               
Enter the 3 element                                                                                                             
4                                                                                                                               
Enter the 4 element                                                                                                             
11                                                                                                                              
Enter the 5 element                                                                                                             
23                                                                                                                              
The sum of the array elements is :50   


Enter the number of elements of the array                                                                                       
7                                                                                                                               
Enter the 1 element                                                                                                             
100                                                                                                                             
Enter the 2 element                                                                                                             
203                                                                                                                             
Enter the 3 element                                                                                                             
359                                                                                                                             
Enter the 4 element                                                                                                             
472                                                                                                                             
Enter the 5 element                                                                                                             
589                                                                                                                             
Enter the 6 element                                                                                                             
638                                                                                                                             
Enter the 7 element                                                                                                             
766                                                                                                                             
The sum of the array elements is :3127                                                                                          
                                           

*/
