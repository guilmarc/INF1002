//  Homework1.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Demonstrates the basic of class creation
//********************************************************************

import java.util.Scanner;

public class Homework1 {

	//Ask for a coin type number
	public static void insertCoin(Coin coin, PiggyBank piggyBank){
		System.out.println("Please enter the number of " + coin);
		
		Scanner scan = new Scanner(System.in);
		int numberOfCoin = scan.nextInt();
		
		piggyBank.insertCoins(coin, numberOfCoin);
	}
	
	//Main function
	public static void main(String[] args){
		//Create a new PiggyBank object
		PiggyBank myPiggyBank = new PiggyBank();		
		
		//Fill my new bank with money
		Homework1.insertCoin(Coin.PENNY, myPiggyBank);
		Homework1.insertCoin(Coin.NICKLE, myPiggyBank);
		Homework1.insertCoin(Coin.DIME, myPiggyBank);
		Homework1.insertCoin(Coin.QUARTER, myPiggyBank);
		//Print the total to the console
		System.out.println(myPiggyBank.totalDecription());
	}
}
