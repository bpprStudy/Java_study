package modifier07_student;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager sm = StudentManager.getManager();
		int sel;
		do {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ��ȸ(�̸�)");
			System.out.println("3. ��������");
			System.out.println("0. ����");
			sel = sc.nextInt();
			if (sel == 1) {
				// �л��߰�
				System.out.println("�л��� �߰��մϴ�.");
				System.out.print("�̸�: ");
				String name = sc.next();
				System.out.print("����: ");
				int age = sc.nextInt();
				System.out.print("����: ");
				String major = sc.next();
				Student st = new Student(name, age, major);
				sm.addStudent(st);
			} else if (sel == 2) {
				// �л� ��ȸ
				System.out.println("�л��� ��ȸ�մϴ�.");
				System.out.print("�̸�: ");
				String name = sc.next();
				Student st = sm.getStudent(name);
				if (st == null) {
					System.out.println("�л��� ã�� ���߽��ϴ�.");
				} else {
					System.out.println("��ȸ�� �л� ������?");
					System.out.println(st.getName());
					System.out.println(st.getAge());
					System.out.println(st.getMajor());
				}
			} else if (sel == 3) {
				// ���� ����
				System.out.println("������ �����մϴ�.");
				System.out.print("�̸�: ");
				String name = sc.next();
				System.out.print("����: ");
				String major = sc.next();
				sm.changeMajor(name, major);
			}
		} while (sel != 0);
	} // main
}
