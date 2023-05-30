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
		System.out.println("���Ӹ� : " + title);
		System.out.println("���� : " + version);
		System.out.println(title + "��(��) �����մϴ�.\n");
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
			System.out.println("�������� �ʴ� �����Դϴ�.");
	}
}

















