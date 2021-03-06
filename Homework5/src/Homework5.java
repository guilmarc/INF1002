import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
			Alives.add(new Human("Éric Guertin", 10, 299687590));
			Alives.add(new Human("Marco Guilmette", 9, 299687834));
			Alives.add(new Plant("Amaranth", 1, true));
			Alives.add(new Plant("Clovers", 1, true));
			Alives.add(new Plant("Dionaea", 2, true));
			Alives.add(new Animal("cat", 5, Element.EARTH, true, true));
			Alives.add(new Animal("fish", 3, Element.WATER, false, false));
			Alives.add(new Human("Geneviève Beaudoin", 10, 980098063));
			Alives.add(new Plant("Deadly nightshade", 1, false));
			Alives.add(new Human("Roger Moquin", 11, 299687598)); //This will cause an exception
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
		
		//• Utiliser la méthode Move() ;
		System.out.println("\n\n*** LET'S TRY TO MOVE THIS 'ALIVE' ***");
		for (Alive thisAlive : Alives) {
			thisAlive.move();
		}
		
		//• Chercher un élément qui se trouve dans le tableau à partir d’un nom ;
		//• Chercher un élément qui ne se trouve pas dans le tableau.
		
		//System.out.println("\n\n*** TRYING TO FIND EN OBJECT BY HIS NAME WITH IndexOf ***");
		//This code should be the best but unable to make it work with equals implementation.
		//Alive foundObject = Alives.get(Alives.indexOf("Clovers"));
		//System.out.print(foundObject.toString());
		
		System.out.println("\n\n*** TRYING TO FIND EN OBJECT BY HIS NAME ***");
		System.out.print("Please enter the name to find here :");
		Scanner scanner = new Scanner(System.in);
		String nameToFind = scanner.nextLine().toUpperCase();
		
		Alive foundAlive = null;
		for (Alive thisAlive : Alives) {
			if (thisAlive.equals(nameToFind) ) {
				foundAlive = thisAlive;
				break;
			}
		}
		
		if (foundAlive != null) {
			System.out.println("\n\n*** THE ITEM WAS FOUND BY IT'S NAME ***");
			System.out.println(foundAlive.toString());
		} else {
			System.out.println("ERROR !!! THE'S NO " + nameToFind +  " IN THE LIST");
		}
		scanner.close();
	}
}
