package Part1_validationOfThing;

public abstract class Thing implements Validable {
	public String name;
	  public Thing(String name){
		  this.name = name;
	    }

	public String toString() {
		return name;
	}
	  
	 
}
