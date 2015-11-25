
public class RationalTester {
	public static void main(String[] args){
		
		RationalNumber r1 = new RationalNumber(1111111111,222222222);
		RationalNumber r2 = new RationalNumber(1111111110,222222222);
		
		System.out.println(r1.compareTo(r2));
	}
}
