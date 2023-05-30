package ch06.exam02;

public class LecturerNight extends Lecturer_Before {
	public LecturerNight() {
		lecturer = "야간 강사";
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + charge * 1.5 + "원\n");
	}
}
