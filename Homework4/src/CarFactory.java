
import java.util.*;

public class CarFactory {

		//Create a random car (simulate a car Factory)
		public Car createRandomCar() {
			Random random = new Random();
			
			int year = 1980 + random.nextInt(35);
			Car.CarColor color = Car.CarColor.valueOf(random.nextInt(6));
			Car.CarMark mark = Car.CarMark.valueOf(random.nextInt(7));
			
			return new Car(mark, year, color);
		}
}
