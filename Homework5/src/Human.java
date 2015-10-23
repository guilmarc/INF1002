//  Human.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Human class
//********************************************************************

public class Human extends Alive {

	private int number;
	
	//Constructor
	Human(String name, int complexity, int number) throws ComplexityException{
		super(complexity);
		this.name = name;
		this.element = Element.EARTH;
		this.number = number;
	}
	
	@Override
	void move() {
		System.out.println("I got two legs and I can swim too !");
	}
	
	public String toString(){
		return "Hi! My name is " + this.name + " and my social insurance number is " + this.number +  ". " + super.toString();
	}
}

/* La classe Humain a une variable d’instance : numéro. Elle redéfinit la méthode
déplacement en affichant un message qui indique qu’un humain est bipède et
qu’il pourrait nager. */