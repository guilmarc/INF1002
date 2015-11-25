
import java.util.*;

public class CarFactory {

		//Create a random car (simulate a car Factory)
		public Car createRandomCar() {
			Random random = new Random();
			
			int year = 1980 + random.nextInt(35);
		    
			Car.CarColor color = Car.CarColor.values()[ random.nextInt( Car.CarColor.values().length - 1) ];
			Car.CarMark mark = Car.CarMark.values()[ random.nextInt( Car.CarMark.values().length - 1 ) ];
			
			return new Car(mark, year, color);
			
		}
}
