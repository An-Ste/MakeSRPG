package SRPG;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Myunit unit = new Myunit();
		Enemy enemy = new Enemy();

		int Unit_MaxHP = unit.hp_max;
		int Enemy_MaxHP = enemy.hp_max;
		
		// 10ターン
		// for (int i = 0; i < 10; i++) {
		// 	System.out.println(" YOUR TURN ");
		// 	unit.use_potion1();
		// 	System.out.println(" ENEMY TURN ");
		// 	enemy.use_potion1();
		// }
		
		System.out.println("Enemy が現れた！");
		
		Character unit_attack  = new Character();
		Character enemy_attack  = new Character();
		Scanner scanner = new Scanner(System.in);

		while (unit.hp > 0 && enemy.hp > 0) {
			// 自分のターン
			System.out.println("行動を選択して下さい！");
			System.out.println("1. 攻撃");
			System.out.println("2. 回復");
			
			int unit_action = scanner.nextInt();
			
			switch (unit_action) {
				case 1: //攻撃を行う
					unit_attack = unit.attack(enemy);
					break;
				
				case 2: //回復を行う
					if (unit.potion_num > 0 && unit.hp < Unit_MaxHP) {
						unit.use_potion1();
					} else if (Unit_MaxHP <= unit.hp) {
						System.out.println(unit.name + " の HPは最大値です！");
						System.out.println("そのため、攻撃を行います！");
						System.out.println();
						unit_attack = unit.attack(enemy);
					} else {
						System.out.println(unit.name + " のポーションは無くなりました！");
						System.out.println("そのため、攻撃を行います！");
						System.out.println();
						unit_attack = unit.attack(enemy);
					}
					break;
			}
			
			// 敵のターン
			int used_count = 0;
			// アイテム残数があり、HPが10以下の時に回復を行う
			if (enemy.potion_num > 0 && 0 < enemy.hp && enemy.hp <= 10 && enemy.hp < Enemy_MaxHP) {
				// 回復を行う
				if (0 < enemy.potion_num) {
					enemy.use_potion1();
					used_count += 1;
				}
			}
			
			// 回復しなかった場合に、攻撃を行う
			if (enemy.potion_num == 0 && 1 <= enemy.hp) {
				enemy_attack = enemy.attack(unit);
			}

		}
		
		// どちらが敗北したか出力
		if (unit.hp <= 0) {
			System.out.println(unit.name + " は倒れた！");
		} else if (enemy.hp <= 0) {
			System.out.println(enemy.name + " は倒れた！");
		}
	}

}
