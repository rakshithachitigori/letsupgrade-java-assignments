/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************
If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int eng, che, comp, phy, maths; 
	    float  percentage;
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Enter the Five Subjects Marks : ");
		eng = s.nextInt();	
		che = s.nextInt();	
		comp = s.nextInt();	
		phy = s.nextInt();	
		maths = s.nextInt();	
	    percentage =((eng+che+comp+phy+maths)*100)/500;    
	    System.out.println(" Marks Percentage =  " + percentage);
	    
	    if(percentage >= 90)
                 System.out.println("Grade A");
    
            else if(percentage >= 80)
                 System.out.println("Grade B");
    
            else if(percentage>= 70)
                 System.out.println("Grade C");
                
            else if(percentage>= 60)
                 System.out.println("Grade D");
                 
            else if(percentage>= 40)
                  System.out.println("Grade E");
                  
           else
                  System.out.println("Grade F");
	    
	    
	}
}

/*OUTPUT:

 Enter the Five Subjects Marks : 70                                                                                      
80                                                                                                                              
85                                                                                                                              
90                                                                                                                              
65                                                                                                                              
 Marks Percentage =  78.0                                                                                                       
Grade C    


 Enter the Five Subjects Marks : 90                                                                                             
85                                                                                                                              
70                                                                                                                              
93                                                                                                                              
68                                                                                                                              
 Marks Percentage =  81.0                                                                                                       
Grade B  

*/
