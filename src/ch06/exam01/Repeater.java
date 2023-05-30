package ch06.exam01;

public class Repeater {
	public Scan scan = new Scan();
	public void repeat() {
		int count = 0;
		int max = scan.returnInt();
		while (count < max) {
			System.out.println("¾È³çÇÏ¼¼¿ä");
			count++;
		}
	}
}
