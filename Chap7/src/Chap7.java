
public class Chap7 {
	public static void main(String[] args){
		int[] array1 = {10,20,30};
		int[] array2 = {40,50,60};
		
		if(array1.length == array2.length){
			int[] temp = new int[array1.length];
			
			for(int i = 0; i<array1.length; i++){
				temp[i] = array1[i];
			}
			
			for(int i = 0; i<array2.length; i++){
				array1[i] = array2[i];
			}
			
			for(int i = 0; i<temp.length; i++){
				array2[i] = temp[i];
			}
			
			
			System.out.print("ARRAY 1");
			for(int thisInt: array1){
				System.out.print("\t" + thisInt);
			}
			
			System.out.println("");
			
			System.out.print("ARRAY 2");
			for(int thisInt: array2){
				System.out.print("\t" + thisInt);
			}
			
			
		} else {
			System.out.print("Les deux tableau ne sont pas de la même taille");
		}
	
		
		
	}
}
