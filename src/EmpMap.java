/*HashMap is created below named EmployeeInfo which stores key value pair information
 *here code of employee is key and emp name is value as described below
 *task is to display only emp names as output which is done as follows
 *thus we have to do key and value pairing and separation for the HashMap*/

import java.util.*;

public class EmpMap  //class EmpMap
{
	
	public static void main(String[] args) //main function
	{	
		HashMap<Integer,String> EmployeeInfo=new HashMap<Integer,String>(); //  creating the EmployeeInfo hash map which will store key value pair
		
		EmployeeInfo.put(101,"Soham Dixit");     // populating 1st employee information in hash map
		EmployeeInfo.put(102,"Shivmalhar Dixit");    // populating 2nd employee information in hash map 
		EmployeeInfo.put(103,"Gautam Dixit");   // populating 3rd employee information in hash map 
		EmployeeInfo.put(104,"Avanti Dixit");      // populating 4th employee information in hash map
		
		System.out.println("Employee Names are:\n"); //printing employee names
		
		for(Map.Entry<Integer,String> m:EmployeeInfo.entrySet())  //for loop is used to print the given employee names stored in HashMap
		{  
			System.out.println(m.getValue());  //prinitng
		}  

	}//end of main
	
} //end of class