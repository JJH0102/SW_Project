package ch06.exam02;

public class LecturerNight extends Lecturer_Before {
	public LecturerNight() {
		lecturer = "�߰� ����";
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + charge * 1.5 + "��\n");
	}
}