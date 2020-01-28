package Part1_validationOfThing;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		allThings.add( new Bike("Scott",1, true, false));
		allThings.add( new Bike("Cannondale",3, false, false));
		
		allThings.add( new RiceCooker("RiceCooker1",1, 2));
		allThings.add(new RiceCooker("RiceCooker2",3, 3));
		
		allThings.add( new ItTeacher("Channak",3, true));
		allThings.add( new ItTeacher("Rady",1, true));
		for (int i = 0; i < allThings.size(); i++) {
			System.out.println(allThings.get(i));
		}
	
	}
	


}
