package Part1_validationOfThing;

public class ItTeacher extends Thing {
	
	//private String name;
	  private int yearsOfExperience;
	  private boolean isBackBreakWorking;
	  public ItTeacher(String name, int yearsOfExperience, boolean isBackBreakWorking ) {
		  super(name);
		  this.yearsOfExperience = yearsOfExperience;
		  this.isBackBreakWorking = isBackBreakWorking;
	  }
	@Override
	public boolean isValid() {
		if(yearsOfExperience > 2) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		String isTeach;
		if(isValid()) {
			isTeach = " Valid";
		}else {
			isTeach = " Not valid";
		}
		return super.toString() + isTeach;
	
	}
	
}
