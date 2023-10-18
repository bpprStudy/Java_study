package modifier07_student;

// �̱���
public class StudentManager {
	// �л� ��ü�� �迭�� �����ҰŶ� �Ŵ����� ��� ������ �Ǹ� �ȵ�
	private Student[] students = new Student[100];
	private int size = 0;

	private static StudentManager manager = new StudentManager();

	private StudentManager() {
	}

	public static StudentManager getManager() {
		return manager;
	}

	public void addStudent(Student st) {
		if (size < students.length)
			students[size++] = st;
		else {
			System.out.println("�����ʰ�");
		}
	}

	public Student getStudent(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
	}

	public void changeMajor(String name, String major) {
		Student st = getStudent(name);
		if (st != null) {
			st.setMajor(major);
		} else {
			System.out.println("�e���� �����ϴ�.");
		}
	}
}
