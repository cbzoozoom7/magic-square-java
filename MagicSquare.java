public class MagicSquare {
	private int [][] msa;
	public MagicSquare (int[][] magicSquareArray) {
		msa = magicSquareArray;
	}
	public boolean isMagicSquare() {
		int magicSum=0;
		for (int a=0; a<msa.length; a++) {
			magicSum += msa[a][0];
		}
		int tmpSum=0;
		//First index value
		for (int a=0; a<msa.length; a++) {
			for (int b=0; b<msa[a].length; b++) {
				tmpSum+=msa[a][b];
			}
			if (tmpSum != magicSum) {
				return false;
			}
			tmpSum = 0;
		}
		//Second index value
		for (int a=0; a<msa[0].length; a++) {
			for (int b=0; b<msa.length; b++) {
				tmpSum+=msa[a][b];
			}
			if (tmpSum!=magicSum) {
				return false;
			}
			tmpSum=0;
		}
		//diagonal/both
		for (int a=0; a<msa.length && a<msa[0].length; a++) {
			tmpSum+=msa[a][a];
		}
		if (tmpSum!=magicSum) {
			return false;
		} else {
			return true;
		}
	}
	public int sum() {
		int magicSum=0;
		for (int a=0; a<msa.length; a++) {
			magicSum += msa[a][0];
		}
		return magicSum;
	}
}