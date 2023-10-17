package class02;

import java.util.Random;

public class FuntionTest3 {
	public static void main(String[] args) {
		boolean homework;
		
		System.out.println("아침에 일어난다.");
		이동("교육장", "대중교통");
		homework = 교육();
		이동("집", "리무진");
		if (homework) {			
			System.out.println("과제를 해결한다.");
		}
		System.out.println("잔다.");
	}
	
	// 집에서 할 과제가 있을 수도 없을 수도
	public static boolean 교육() {
		System.out.println("오전수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후수업을 듣는다.");
		
		// 랜덤 과제 발생
		Random random = new Random();
		return random.nextBoolean(); // 랜덤하게 True, False 반환
	}
	
	public static void 이동(String 장소, String 탈것) {
		System.out.println(장소+"(으)로 "+탈것+"(을)를 이용하여 이동한다.");
	}
	
	
	
}
