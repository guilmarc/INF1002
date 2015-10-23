//  House.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  House class with a complete constructor, setter and getter examples
//*********************************************************************

public class House {
	
	private String address;				//This house address
	private int rooms;					//The number of rooms
	private int yearOfConstruction;		//The year this house was built
	private int price;					//The house value
	private HouseType houseType;		//The house type (single, twin, duplex, triplex);
	
	//Constructor used to create a new House object
	House(HouseType houseType, int yearOfConstruction, int rooms, int price, String address) {
		this.houseType = houseType;
		this.yearOfConstruction = yearOfConstruction;
		this.rooms = rooms;
		this.price = price;
		this.address = address;
	}

	  //public method to get the yearOfConstruction variable
	  public int getYearOfContruction(){
	       return yearOfConstruction;
	  }

	  //public method to set the price variable
	  public void setPrice(int price){
	       this.price = price;
	  }
	
	  //public method to build a human readable description of this house
	  public String toString(){
		  return "This " + houseType.Description + " house built in " + yearOfConstruction + " has " + rooms + " rooms and worth " + price + "$.  You can visit it at " + address;
	  }	
}
