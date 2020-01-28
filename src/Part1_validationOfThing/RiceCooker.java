package Part1_validationOfThing;

public class RiceCooker extends Thing{
	
	//private String name;
	  private int age;
	  private int numberOfUse;
	  public RiceCooker(String name, int age, int numberOfUse ) {
		  super(name);
		  this.age = age;
		  this.numberOfUse = numberOfUse;
	  }
	@Override
	public boolean isValid() {
		if(age < 2 && numberOfUse < 500) {
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
		return super.toString() + isWorking;
	}
	
}
