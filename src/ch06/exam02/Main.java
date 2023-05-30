package ch06.exam02;

public class Main {
	public static void main(String[] args) {
		LecturerAtGs lect01 = new LecturerAtGs();
		lect01.Lecturer();
		
		LecturerNight lect02 = new LecturerNight();
		lect02.Lecturer();
		
		LecturerWithWork lect03 = new LecturerWithWork();
		lect03.Lecturer();
		
		Lecturer_Before lect04 = new Lecturer_Before();
		lect04.Lecturer();
	}
}
