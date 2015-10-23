//  Plant.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Plant class
//********************************************************************

public class Plant extends Alive {

	
	private boolean edible;
	
	//Constructor
	Plant(String name, int complexity, boolean edible) throws ComplexityException{
		super(complexity);
		this.name = name;
		this.element = Element.EARTH;
		this.edible = edible;
	}
	
	
	@Override
	void move() {
		System.out.println("I don't move, i'm stuck in the ground !");
	}
	
	public String toString(){
		return "I'm a plant nammed " + this.name +  " and i'm " + (this.edible ? "edible" : "toxic") + ". " + super.toString();
	}

}

/* La classe Plante a une variable d’instance booléenne : comestible. Elle
redéfinit la méthode déplacement avec un message qui indique qu’une plante
ne se déplace pas. */