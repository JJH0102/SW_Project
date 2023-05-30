package ch06.exam04;

public class GameServer 
{
	public String title;
	public String version;
	public SuperMario supermario;
	public Tetris tetris;
	public LOL lol;
	public Racing racing;
	
	public void Game_Play(String game) {
		choiceGame(game);
		Start();
	}
	
	public void Start() {
		System.out.println("게임명 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "을(를) 시작합니다.\n");
	}
	
	public void choiceGame(String game) {
		if (game.equals("supermario")) {
			supermario = new SuperMario();
			title = supermario.returnVersion();
			version = supermario.returnVersion();
		} else if (game.equals("tetris")) {
			tetris = new Tetris();
			title = tetris.returnVersion();
		} else if (game.equals("lol")) {
			lol = new LOL();
			title = lol.returnVersion();
			version = lol.returnVersion();
		} else if (game.equals("racing")) {
			racing = new Racing();
			title = lol.returnVersion();
			version = lol.returnVersion();
		} else
			System.out.println("지원하지 않는 게임입니다.");
	}
}

















