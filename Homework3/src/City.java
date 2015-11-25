//  City.java        
//	Author: Marco Choinière-Guillemette & Mélyna Lachance
//	Automne 2015
//  City class
//********************************************************************

public class City implements Comparable<City> {
	
	private String name;
	private Boolean academic;
	private String country;
	private int population;
	
	City(String name, Boolean universitary, String country, int population){
		this.name = name;
		this.academic = universitary;
		this.country = country;
		this.population = population;
	}
	
	public String getName(){
		return this.name;
	}
	
	//public method to get the academic variable
	public Boolean getAcademic(){
		return this.academic;
	}

	 //public method to set the population variable
	public void setPopulation(int population){
		this.population = population;
	}	
	
	@Override
	public int compareTo(City o) {
		final int LOWER = -1;
	    final int EQUAL = 0;
	    final int HIGHER = 1;
	    
	    if (this.population > o.population)
	    	return HIGHER;
	    
	    if (this.population < o.population)
	    	return LOWER;
	    
	    return EQUAL;
	} 
	
	@Override 
	public boolean equals(Object aThat) {
	     if (this == aThat) return true;
	     if (!(aThat instanceof City)) return false;

	     return this.population == ((City)aThat).population;
	}

	public String toString (){
	    return name + (academic ? " is an academic city of " : " is a city of ") + population + " peoples situated in " + country;
	}
}
