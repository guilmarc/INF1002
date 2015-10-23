//  Homework4.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  
//********************************************************************

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Homework4 {
	//Main function
	
	public static void showMenu(){
		System.out.println("*************************************************************");
		System.out.println("* [1] Créer une voiture et l’ajouter au tableau             *");	
		System.out.println("* [2] Afficher le nombre de voitures créées                 *");	
		System.out.println("* [3] Comparer les deux premières voitures du tableau       *");	
		System.out.println("* [4] Enlever une voiture du tableau (voiture à l’indice i) *");	
		System.out.println("* [5] Afficher les voitures contenues dans le tableau       *");	
		System.out.println("* [Q] Quitter                                               *");
		System.out.println("*************************************************************");
	}
	
	public static void WaitForKey()
	{
		//Wait for the menu to come back
		System.out.println("Press ENTER key to show menu again...");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\b\n\b\n\b\n\b\n"); //Unable to clear console event not working on stackoverflow
	}
	
	public static void main(String[] args) throws IOException{
		ArrayList<Car> cars = new ArrayList<Car>();
		
		Scanner scan = new Scanner(System.in);
		char input;

		do{
			
			Homework4.showMenu();
			
			input = scan.next().toUpperCase().charAt(0);
			
			switch(input) {
				case '1': //Créer une voiture et l’ajouter au tableau
					cars.add(new CarFactory().createRandomCar());
					System.out.println("A new random car has been built\n");
					Homework4.WaitForKey();
					break;
				case '2': //Afficher le nombre de voitures créées
					System.out.println(Car.getUnitBuilt() + " car(s) have been built...\n");
					Homework4.WaitForKey();
					break;
				case '3':
					if (Car.getUnitBuilt() > 1) {
						String compare = "";
						switch (cars.get(0).compareTo(cars.get(1))){
							case -1: //Lower
								compare = "older";
								break;
							case 0: //Equivalent
								compare = "equivalent";
								break;
							case 1: //Higher
								compare = "newer";
								break;
						}
					
						System.out.println("Car #1 is " + compare + " to car #2 \n");
						Homework4.WaitForKey();
					} else {
						System.out.println("Unable to compare. " + (Car.getUnitBuilt() == 0 ? "No car have been built": "Only one car has been built"));
						Homework4.WaitForKey();
					}
					break;
				case '4':
					if(cars.size() == 0){
						System.out.println("No car has been built.\n");
						Homework4.WaitForKey();
						break;
					}
					System.out.println("What is the car index to remove ? (0 to " + (cars.size() - 1) + ")");
					int index = scan.nextInt();
					//break if this is an invalid index
					if(index > cars.size() - 1) {
						System.out.println("Invalid index, please try gain.\n");
						Homework4.WaitForKey();
						break;
					}
					cars.remove(index);
					System.out.println("Car #" + index + " removed\n");	
					Homework4.WaitForKey();
					break;
				case '5':
					for(Car thisCar : cars) {
						System.out.println(thisCar.toString());
					}
					Homework4.WaitForKey();	
					
					break;
				case 'Q':	
					break;
				default:
					System.out.println("Touche invalide !");
					break;
			}
			
			//TODO: Find a way to clear console here
			
		}
		while (input != 'Q');
		
		System.out.print("END OF PROGRAM");
		scan.close();
	}
}
