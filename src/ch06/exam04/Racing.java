package ch06.exam04;

public class Racing extends Games
{
	public Racing() {
		title = returnTitle();
		version = returnVersion();
	}
	
	public String returnTitle() {
		return "Racing";
	}
	
	public String returnVersion() {
		return "v2.3";
	}
}
