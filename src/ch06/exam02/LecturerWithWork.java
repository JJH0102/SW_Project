package ch06.exam02;

public class LecturerWithWork extends Lecturer_Before {
	public LecturerWithWork() {
		lecturer = "������ �ִ� ����";
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + charge * 1/2 + "��\n");
	}
}
