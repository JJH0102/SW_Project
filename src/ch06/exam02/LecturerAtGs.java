package ch06.exam02;

public class LecturerAtGs extends Lecturer_Before {
	public LecturerAtGs() {
		lecturer = "���п� ����";
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + charge * 2 + "��\n");
	}
}
