package Part1_validationOfThing;

public class Bike extends Thing {
	
//  private String name;
  private int age;
  private boolean isFrontBreakWorking;
  private boolean isBackBreakWorking;
  public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking ) {
	  super(name);
	  this.age = age;
	  this.isFrontBreakWorking = isFrontBreakWorking;
	  this.isBackBreakWorking = isBackBreakWorking;
  }
@Override
public boolean isValid() {
	if(age < 2 && (isFrontBreakWorking || isBackBreakWorking)) {
	return true;
	}else {
		return false;
	}
}
@Override
public String toString() {
	String isWorking;
	if(isValid()) {
		isWorking = " Valid";
	}else {
		isWorking = " Not valid";
	}
	return super.toString()+ isWorking;
}
  
 
}
