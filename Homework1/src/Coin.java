//  Homework1.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Enumerate all the coin type and set the value
//********************************************************************

public enum Coin {
	PENNY(0.01), NICKLE(0.05), DIME(0.10), QUARTER(0.25);
	public double value;

	private Coin(double value) {
		this.value = value;
	}
};


