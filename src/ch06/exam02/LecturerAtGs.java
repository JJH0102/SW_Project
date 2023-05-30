package ch06.exam02;

public class LecturerAtGs extends Lecturer_Before {
	public LecturerAtGs() {
		lecturer = "대학원 강사";
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + charge * 2 + "원\n");
	}
}
