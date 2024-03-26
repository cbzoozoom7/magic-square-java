public class MagicSquareTester {
	public static void main(String[] args) {
		int[][]  aTwoDArray = {{16,3,2,13},
							  {5,10,11,8},
							  {9,6,7,12},
							  {4,15,14,1}};;
		MagicSquare mMs = new MagicSquare(aTwoDArray);
		if (mMs.isMagicSquare())
			System.out.println("This is a Magic Square");
		else
			System.out.println("This is Not a Magic Square");
		System.out.println("The magic sum is " + mMs.sum());
	}
}