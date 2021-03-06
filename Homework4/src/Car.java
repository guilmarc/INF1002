

//  Car.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  
//********************************************************************


public class Car implements Comparable<Car>{
	
	public enum CarMark {
		ACURA("an Acura"),
		HONDA("an Honda"),
		TOYOTA("a Toyota"),
		CHEVROLET("a Chevrolet"),
		HYUNDAI("a Hyunday"),
		KIA("a Kia"),
		MAZDA("a Mazda"),
		NISSAN("a Nissan");
		
		public String description;
		
		CarMark(String description){
			this.description = description;
		}
	}
	
	
	public enum CarColor {
		WHITE("white"),
		RED("red"),
		BLUE("blue"),
		GREEN("green"),
		YELLOW("yellow"),
		GRAY("gray"),
		BLACK("black");
		
		public String description;
		
		CarColor(String description){
			this.description = description;
		}
	}

	private static int unitBuilt = 0;
	private CarMark mark;
	private int year;
	private CarColor color;
	
	Car(){
		unitBuilt++;
	}
	
	public Car(CarMark mark, int year, CarColor color){
		this();
		this.mark = mark;
		this.year = year;
		this.color = color;
	}

	public static int getUnitBuilt(){
		return unitBuilt;
	}

	public String toString(){
		return "This " + this.color.description + " car built in " + this.year + " is a " + this.mark.description;
	}

	@Override
	public int compareTo(Car o) {
		final int LOWER = -1;
	    final int EQUAL = 0;
	    final int HIGHER = 1;

	    if (this.year > o.year)
	    	return HIGHER;
	    
	    if (this.year < o.year)
	    	return LOWER;
	    
	    return EQUAL;
	}
	
}
