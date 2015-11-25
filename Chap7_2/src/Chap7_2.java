import java.util.ArrayList;
import java.util.Scanner;

/*Réaliser un programme pour manipuler des matrices carrées (tableaux à 2 dimensions
de taille N x N, où N est un entier positif). Lire N et les éléments de la matrice (une ligne
après l’autre). Vérifier si la matrice est diagonale.
Une matrice est diagonale si les éléments qui ne sont pas sur la diagonale sont tous
nuls.*/ 

public class Chap7_2 {
	public static void main(String[] args){
		final int N = 3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer la dimention de la matrice (2,3,4 ..) ?");
		int dimention = scan.nextInt();
		
		for(int i = 1; i <= dimention; i++) {
			System.out.println("Veuillez entrer la ligne " + i);
			String line = scan.nextLine();
			line.p
		}
		
		
	}
	
	public static ArrayList<int> stringToIntArray(String input){
		
		ArrayList numbers = new ArrayList();
		
		String[] stringNumbers = input.split(input);
		
		for (String thisStringNumber : stringNumbers) {
			int number = Integer.parseInt(thisStringNumber);
			numbers.add(number);
		}
		
		return numbers;
		//return new int[];
	}
}
