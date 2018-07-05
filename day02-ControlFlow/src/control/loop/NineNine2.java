package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		int stage = 2;

		for (int line = 2; line <= 9; line += 3) {
			System.out.println();
			for (int i = stage; i <= stage + 2; i++) {
				if(i >= 10) {
					break;
				}
				System.out.printf("%d 단                   ", i);
			}
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				System.out.println();

				for (stage = line; stage <= line + 2; stage++) {
					if (stage >= 10) {
						break;
					}
					System.out.printf("%d x %d = %2d | ", stage, times, stage * times);
				}

			}
			System.out.println();
		}

	}
}
