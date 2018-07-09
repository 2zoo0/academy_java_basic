import java.util.Random;

public class DevilNineNine {

	public static void main(String[] args) {
//		Random random = new Random();
//		int randomInt01 = random.nextInt(8);
//		String[] lmenu= {"맛존", "고씨네", "쌀국수", "맘스터치", "도스마스", "", ""};
//	
//		System.out.printf("오늘의 점심은 '%s' ", lmenu[randomInt01]);
		
		
		int[] stage = {1, 2, 3};
		for (int sta : stage) {
			for (int idx = 1; idx <= 9; idx++) {
				System.out.printf("%n%d x %d = %2d", sta, idx, sta * idx);
			}
			System.out.println();
		}
		
	}

}
