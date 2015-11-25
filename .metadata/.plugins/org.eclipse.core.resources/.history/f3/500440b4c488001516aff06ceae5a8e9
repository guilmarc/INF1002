//  Homework3.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Demonstrates the basic set and get methods
//********************************************************************

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Homework3 {
	
	
	public static void showMenu(){
		System.out.println("************************************************");
		System.out.println("* [1] Create a new city.                       *");	
		System.out.println("* [2] Show existing cities.                    *");	
		System.out.println("* [3] Is two selected cities are equal?        *");	
		System.out.println("* [4] Compare two selected cities.             *");	
		System.out.println("* [5] Set a new population for a city in list. *");	
		System.out.println("* [Q] Quit.                                    *");
		System.out.println("************************************************");
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
	
	//Main function
	public static void main(String[] args) throws IOException{
 		

		
		Scanner scan = new Scanner(System.in);
		ArrayList<City> cities = new ArrayList<City>();
		char menuInput;
		
		//Test value to uncomment if needed
		cities.add(new City("Shanghai", true, "China", 24150000));
		cities.add(new City("Karachi", false, "Pakistan", 23500000));
		cities.add(new City("Moscow", true, "Russia", 12100000));
		cities.add(new City("Dhaka", false, "Bangladesh", 121000000));
		cities.add(new City("Sao Polo", true, "Brazil", 11895893));
		
		do{
			
			Homework3.showMenu();			
			menuInput = scan.next().toUpperCase().charAt(0);
			scan.nextLine(); //Clear the read buffer to avoid double ENTER
			
			switch(menuInput) {
				case '1': //Create an new city
					System.out.println("\nEnter the city name.");
					String name = scan.nextLine();
					
					System.out.println("\nIs this an academic city (Y or N) ?");
					String academic = scan.nextLine().toUpperCase();
					
					System.out.println("\nWhat is the country of " + name +  " ?");
					String country = scan.nextLine();
					
					System.out.println("\nEnter the population of " + name + "");
					int population = scan.nextInt();
					
					City newCity = new City(name, (academic.equals("Y") ? true : false), country, population);
					cities.add(newCity);
					System.out.println("\nA new city named " + newCity.name + " has been created\n");
				
					Homework3.WaitForKey();
					break;
					
				case '2': //Show all city using toString()
					for(City thisCity : cities){
						System.out.println(thisCity.toString());
					}
					System.out.println("\n");
					Homework3.WaitForKey();
					break;
					
				case '3': //Is the city #1 equals to city #2?
					if(cities.size() >= 2) {
						for(City thisCity : cities){
							System.out.println(cities.indexOf(thisCity) + ") " + thisCity.name);
						}
						
						System.out.println("Enter the first city number to compare (0 to " + (cities.size()-1) + ")");
						int equal1 = scan.nextInt();
						
						for(City thisCity : cities){
							System.out.println(cities.indexOf(thisCity) + ") " + thisCity.name);
						}
						System.out.println("Enter the second city number to compare (0 to " + (cities.size()-1) + ")");
						int equal2 = scan.nextInt();
						
						
						System.out.println(cities.get(equal1).name + " is " + (cities.get(equal1).equals(cities.get(equal2)) ? "equal" : "not equal") + " to " + cities.get(equal2).name + "\n");
						Homework3.WaitForKey();
					} else {
						System.out.println("You need at least 2 cities to compare.\n");
						Homework3.WaitForKey();
					}
					break;
					
				case '4': //Compare
					if(cities.size() >= 2) {
						
						for(City thisCity : cities){
							System.out.println(cities.indexOf(thisCity) + ") " + thisCity.name);
						}
						
						System.out.println("Enter the first city number to compare (0 to " + (cities.size()-1) + ")");
						int compare1 = scan.nextInt();
						
						for(City thisCity : cities){
							System.out.println(cities.indexOf(thisCity) + ") " + thisCity.name);
						}
						System.out.println("Enter the second city number to compare (0 to " + (cities.size()-1) + ")");
						int compare2 = scan.nextInt();
						
						final int LOWER = -1;
					    final int EQUAL = 0;
					    final int HIGHER = 1;
						
					    String compare = "";
						switch (cities.get(compare1).compareTo(cities.get(compare2))){
							case LOWER:
								compare = " is less populated than ";
								break;
							case EQUAL:
								compare = " is equivalent to ";
								break;
							case HIGHER:
								compare = " is most populated than ";
								break;
						}
						
						System.out.println(cities.get(compare1).name + compare + cities.get(compare2).name);
						Homework3.WaitForKey();
					} else {
						System.out.println("You need at least 2 cities to compare.\n");
						Homework3.WaitForKey();
					}
					break;
				case '5':	
					if(cities.size() >= 1) {
						
						for(City thisCity : cities){
							System.out.println(cities.indexOf(thisCity) + ") " + thisCity.name);
						}
						
						System.out.println("Enter the city number to update (0 to " + (cities.size()-1) + ")");
						int index = scan.nextInt();
						
						System.out.println("Enter the population of " + cities.get(index).name + "\n");
						population = scan.nextInt();
						cities.get(index).setPopulation(population);
						System.out.println("Success: New population has been saved for " + cities.get(index).name + "\n");
						Homework3.WaitForKey();
					} else {
						System.out.println("You need at least 1 city\n");
						Homework3.WaitForKey();
					}
					break;
				case 'Q':
					System.out.println("Quitting program...\n");	
					break;
				default:
					System.out.println("Touche invalide !\n");
					Homework3.WaitForKey();
					break;
			}
			
			//TODO: Find a way to really clear console here
			//Nothing on stackoverflow, ouf !!
			
		}
		while (menuInput != 'Q');
		scan.close();
		
	}
}
