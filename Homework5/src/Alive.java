//  Alive.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Alive abstract class
//********************************************************************

abstract class Alive implements Comparable<Alive> {
	
	protected String name;
	protected Element element;
	protected int complexity;
	
	Alive(int complexity) throws ComplexityException{
		if (complexity < 1 || complexity > 10) {
			throw new ComplexityException("Invalid complexity (" + complexity + ")" );
		}
		this.complexity = complexity;
	}
	
	
	abstract void move();
	
	public int compareTo(Alive o) {
		final int LOWER = -1;
	    final int EQUAL = 0;
	    final int HIGHER = 1;

	    if (this.complexity > o.complexity)
	    	return HIGHER;
	    
	    if (this.complexity < o.complexity)
	    	return LOWER;
	    
	    return EQUAL;
	}
	
	@Override 
	public boolean equals(Object aThat) {
	     if (this == aThat) return true;
	     //if (!(aThat instanceof Alive)) return false;

	     return this.name == ((Alive)aThat).name;
	}
	
	private String complexityToString(){
		switch (complexity){
		case 1: return "very simple";
		case 2: case 3: return "simple";
		case 4: case 5: return "in the average complexity";
		case 6: case 7: return "quite complex";
		case 8: case 9: return "complex";
		case 10: return "very complex";
		default: return "of unknown complexity";
		}
	}
	
	public String toString(){
		return "I'm living " + this.element.Description + " and i'm " + this.complexityToString() + ".";
	}
	
}