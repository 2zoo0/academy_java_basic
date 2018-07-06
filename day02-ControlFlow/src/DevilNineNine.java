import java.util.Random;

public class DevilNineNine {

	public static void main(String[] args) {
		Random random = new Random();
		int randomInt01 = random.nextInt(8);
		String[] lmenu; 
		lmenu = new String[10];
		lmenu[0] = "맛존";
		lmenu[1] = "고씨네";
		lmenu[2] = "도스마스";
		lmenu[3] = "사이공 쌀국수";
		lmenu[4] = "맘스터치";
		lmenu[5] = "백반";
		lmenu[6] = "뚝배기";
		lmenu[7] = "행컵";
		System.out.printf("오늘의 점심은 '%s' ", lmenu[randomInt01]);
	}

}
