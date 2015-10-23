//  Animal.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Animal class
//********************************************************************

public class Animal extends Alive {

	private boolean domestic;
	private boolean mammal;
	
	//Constructor
	Animal(String name, int complexity, Element element, boolean domestic, boolean mammal) throws ComplexityException{
		super(complexity);
		this.name = name;
		this.element = element;
		this.domestic = domestic;
		this.mammal = mammal;
	}
	
	@Override
	void move() {
		System.out.println("I can walk and/or swim and/or fly");
	}

	public String toString(){
		return "I'm a " + name + ", a" + (this.domestic ? " domestic" :  "") +  (this.mammal ? " mammal" : "n animal") + ". " + super.toString() ;
	}
}

/*
La classe Animal a deux variables d’instance : deux booléennes pour savoir si
l’animal est domestique et, si c’est un mammifère. Elle redéfinit la méthode
déplacement en affichant un message qui indique qu’un animal peut marcher
et/ou nager et/ou voler. 
*/