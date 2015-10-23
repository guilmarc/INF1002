import java.util.ArrayList;
import java.util.Collections;

//  Homework5.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Utilisation de l’héritage, du polymorphisme et des exceptions
//********************************************************************

public class Homework5 {
	public static void main(String[] args){
		/*
		Vous faites aussi un programme pilote. Le programme pilote permettra de constituer un
		tableau d’objets de type Vivant. Il permettra aussi d’afficher les éléments du tableau,
		de trier le tableau, de rechercher un élément dans le tableau.
		*/
		
		ArrayList<Alive> Alives = new ArrayList<Alive>();
		
		//• Mettre les objets dans le tableau : vous devez intercepter l’exception ComplexitéIncorrecte ;
		try {
			Alives.add(new Animal("bird", 6, Element.EARTH_AIR, false, false));
			Alives.add(new Animal("dog", 6, Element.EARTH, true, true));
			Alives.add(new Human("Éric Guertin", 10, 299687598));
			Alives.add(new Human("Marco Guilmette", 9, 299687598));
			Alives.add(new Plant("Amaranth", 1, true));
			Alives.add(new Plant("Clovers", 1, true));
			Alives.add(new Plant("Dionaea", 2, true));
			Alives.add(new Animal("cat", 5, Element.EARTH, true, true));
			Alives.add(new Animal("fish", 3, Element.WATER, false, false));
			Alives.add(new Human("Geneviève Beaudoin", 10, 299687598));
			Alives.add(new Plant("Deadly nightshade", 1, false));
			//Alives.add(new Human("Roger Moquin", 11, 299687598));
		} catch (ComplexityException e) {
			e.printStackTrace();
		}
		
		//• Afficher les éléments du tableau ;
		System.out.println("\n\n*** THE LIST IS NOT SORTED ***");
		for (Alive thisAlive : Alives) {
			System.out.println(thisAlive.toString());
	 	}
		
		//• Trier le tableau selon la complexité ;
		Collections.sort(Alives);
		
		//• Afficher de nouveau les éléments du tableau ;
		System.out.println("\n\n*** THE LIST IS NOW SORTED BY COMPLEXITY ***");
		for (Alive thisAlive : Alives) {
			System.out.println(thisAlive.toString());
	 	}
		
		//• Chercher un élément qui se trouve dans le tableau à partir d’un nom ;
		System.out.println("\n\n*** THE ITEM WAS FOUND BY IT'S NAME ***");
		Alive foundObject = Alives.get(Alives.indexOf("Clovers"));
		
		System.out.print(foundObject.toString());
		
		//• Chercher un élément qui ne se trouve pas dans le tableau. 
		
	}
}