package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		double fah, cel;

		for (fah = 0.0; fah <= 100.0; fah += 10.0) {
			cel = 5 / 9 * (fah - 32); 			
			// 5 / 9 는 int 계산이므로 0이 되므로
			cel = 5.0 / 9 * (fah - 32); 		
			// .0을 붙이거나
			cel = (double)5 / 9 * (fah - 32);   
			// (double)을 붙여 int을 double형으로 변환해야함
			
			System.out.printf("%5.1f F = %5.1f C %n", fah, cel);
		} // end for

	}// end main

}
