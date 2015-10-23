//  HouseType.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  List of all available HouseType and the textual description for each
//********************************************************************


public enum HouseType {
	SINGLE("single"),
	TWIN("twin"),
	DUPLEX("duplex"),
	TRIPLEX("triplex");
	
	public String Description;
	
	HouseType(String Description){
		this.Description = Description;
	}
}
