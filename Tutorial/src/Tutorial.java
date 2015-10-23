import java.util.Scanner;

public class Tutorial {
	//Main function
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter bool");
		scanner.nextBoolean();
		
		System.out.println("Enter String");
		scanner.nextLine();
		
		System.out.println("Enter String");
		scanner.nextLine();
		
		scanner.close();
	}
}
