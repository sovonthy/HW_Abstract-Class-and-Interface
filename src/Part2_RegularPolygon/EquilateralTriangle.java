package Part2_RegularPolygon;

public class EquilateralTriangle implements RegularPolygon{
  final int getNumSides = 4;
  public int getSideLength;
  public EquilateralTriangle(int getSideLength) {
	  this.getSideLength = getSideLength;
  }
	@Override
	public int getNumSides() {
		
		return getNumSides;
	}
	
	@Override
	public int getSideLength() {
		
		return getSideLength;
	}

}
