package class02;

public class PersonTest {
	public static void main(String[] args) {
		String name1 = "Yang";
		String name2 = "Hong";
		
		int age1 = 45;
		int age2 = 25;
		
		String hobby1 = "Youtube";
		String hobby2 = "Golf";
		
		//�迭�� �̿��ؼ� ����
		int size = 2;
		String[] names = new String[size];
		names[0] = "Yang";
		names[1] = "Hong";
		
		int[] ages = new int[size];
		ages[0] = 45;
		ages[1] = 25;
		
		String[] hobbies = new String[size];
		hobbies[0] = "Youtube";
		hobbies[1] = "Golf";
		
//		System.out.println("���� �̸��� "+names[0]+"�Դϴ�.");
//		System.out.println("���̴� "+ages[0]+"��, ��̴� "+hobbies[0]+"�Դϴ�.");
//		System.out.println("���� �̸��� "+names[1]+"�Դϴ�.");
//		System.out.println("���̴� "+ages[1]+"��, ��̴� "+hobbies[1]+"�Դϴ�.");
		
//		for(int i = 0 ; i<size; i++) {
//			System.out.println("���� �̸��� "+names[i]+"�Դϴ�.");
//			System.out.println("���̴� "+ages[i]+"��, ��̴� "+hobbies[i]+"�Դϴ�.");			
//		}
		for(int i = 0 ; i<size; i++) {
			info(names[i], ages[i], hobbies[i]);
		}
	}
	
	public static void info(String name, int age, String hobby) {
		System.out.println("���� �̸��� "+name+"�Դϴ�.");
		System.out.println("���̴� "+age+"��, ��̴� "+hobby+"�Դϴ�.");					
	}
	
	
	
	
	
	
	
	
	
	
}
