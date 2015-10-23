//  Homework2.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Demonstrates the basic set and get methods
//********************************************************************

public class Homework2 {

	//Main function
	public static void main(String[] args){
		House myHouse = new House(HouseType.TWIN, 2006, 5, 196500, "9514 Claude-Masson, Trois-Rivières QC  G9C 0C7"); 
		
		//Set a new price for this House
		myHouse.setPrice(198500);
		
		//Show a single value coming from the House class
		System.out.println("Found a new house built in " + myHouse.getYearOfContruction());
		
		//Shows the human readable description of this house
		System.out.println(myHouse.toString());
		
	}
	
}
