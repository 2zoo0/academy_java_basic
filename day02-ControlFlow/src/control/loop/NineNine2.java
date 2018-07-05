package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		int stage = 2;

		for (int line = 2; line <= 9; line += 3) {
			System.out.println();
			for (int i = stage; i <= stage + 2; i++) {
				if(i >= 10) {
					break;
				} // 10단 부턴 안 해
				System.out.printf("%d 단                   ", i);
			} // 제목
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				System.out.println();

				for (stage = line; stage <= line + 2; stage++) {
					if (stage >= 10) {
						break;
					} // 10단 부턴 안 해
					System.out.printf("%d x %d = %2d | ", stage, times, stage * times);
				} // 단

			} // 1 ~ 9
			System.out.println();
		} // 구구단 2~9

	}
}
