

//  Car.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  
//********************************************************************


public class Car implements Comparable<Car>{
	
	public enum CarMark {
		ACURA("acura"),
		HONDA("honda"),
		TOYOTA("toyota"),
		CHEVROLET("chevrolet"),
		HYUNDAI("yellow"),
		KIA("gray"),
		MAZDA("black"),
		NISSAN("nissan");
		
		public String Description;
		
		CarMark(String Description){
			this.Description = Description;
		}
		
		public static CarMark valueOf(int nextInt) {
			switch(nextInt){
				case 0: return ACURA ;
				case 1: return HONDA ;
				case 2: return TOYOTA ;
				case 3: return CHEVROLET ;
				case 4: return HYUNDAI ;
				case 5: return KIA ;
				case 6: return MAZDA ;
				case 7: return NISSAN ;
			}
			return null;
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
		
		public String Description;
		
		CarColor(String Description){
			this.Description = Description;
		}

		public static CarColor valueOf(int nextInt) {
			// TODO Auto-generated method stub
			switch(nextInt){
				case 0: return WHITE ;
				case 1: return RED ;
				case 2: return BLUE ;
				case 3: return GREEN ;
				case 4: return YELLOW ;
				case 5: return GRAY ;
				case 6: return BLACK ;
			
			}
			return null;
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
		return "This " + this.color.Description + " car built in " + this.year + " is a " + this.mark;
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