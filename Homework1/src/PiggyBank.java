//  PiggyBank.java        
//	Author: Marco Choinière-Guillemette
//	Automne 2015
//  Class used to simulate a PiggyBank including coin type (enum)
//*********************************************************************


import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;

public class PiggyBank {
	
	//Create the new coin list
	public List<Coin> coins;
	
	//Initiate the new coin list
	PiggyBank(){
		coins = new ArrayList<Coin>();
	}
	
	//Insert a Penny in the bank
	public void insertPenny(){
		this.coins.add(Coin.PENNY);
	}
	
	//Insert a Nickel in the bank
	public void insertNickel(){
		this.coins.add(Coin.NICKLE);
	}
	
	//Insert a Dime in the bank
	public void insertDime(){
		this.coins.add(Coin.DIME);
	}
	
	//Insert a Quarter in the bank
	public void insertQuarter(){
		this.coins.add(Coin.QUARTER);
	}
	
	//Insert many same type coin at a time
	public void insertCoins(Coin coin, int number){
		for(int i = 0; i < number; i++){
			this.coins.add(coin);
		}
	}
	
	//Break down the piggy bank 
	public void emptyBank(){
		for (Coin thisCoin : coins){
			coins.remove(thisCoin);
		}
	}
	
	//Returns the total in the bank (in $)
	public double total(){
		double sum = 0;
		for(Coin thisCoin: coins){
			  sum += thisCoin.value;		  
		}
		return sum;
	}
	
	//Returns a human readable description of the total
	public String totalDecription(){
		return "This piggy bank contains " + NumberFormat.getCurrencyInstance().format(this.total());
		//return "This piggy bank contains " + (int)(this.total() / 100) + " dollars and " + (int)(this.total() % 100) + " cent(s)";
	}

}
