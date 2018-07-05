package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
		for (int idx : numberArray) {
			System.out.printf("%3d * %3d = %4d%n", idx, idx, idx*idx);
		} // end for
	}

}
