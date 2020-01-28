package Part2_RegularPolygon;

public class Square implements RegularPolygon{

	 final int getNumSides = 3;
	  public int getSideLength;
	  public Square(int getSideLength) {
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
