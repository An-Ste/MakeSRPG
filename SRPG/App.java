package SRPG;

public class App {

	public static void main(String[] args) {

		Myunit unit = new Myunit();
		Enemy enemy = new Enemy();
		
		// 10ターン
		for (int i = 0; i < 10; i++) {
			System.out.println(" YOUR TURN ");
			unit.use_potion1();
			System.out.println(" ENEMY TURN ");
			enemy.use_potion1();
		}
	}

}
