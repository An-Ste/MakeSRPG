package SRPG;

public class Character {
	
	// ステータス値
	String name; // 名前
	int hp; // HP
	int hp_max; // HPの最大値
	int physics_power; // 物理攻撃力
	int physics_defense; // 物理防御力
	int magic_power; // 魔法攻撃力
	int magic_defense; // 魔法防御力
	int speed; // 速さ
	int luck; // 幸運
	int tech; // 技
	int move; // 移動
	int lv; // レベル
	int slot1, slot2, slot3;
	int potion_num;
	int item_power;
	
	// // 成長率に関して
	// int glow_hp; // HP
	// int glow_physics_power; // 物理攻撃力
	// int glow_physics_defense; // 物理防御力
	// int glow_magic_power; // 魔法攻撃力
	// int glow_magic_defense; // 魔法防御力
	// int glow_speed; // 速さ
	// int glow_luck; // 幸運
	// int glow_tech; // 技
	
	// コマンド処理

	// 攻撃
	// public Character attack(Character chara) {
	// 	int damage = this.physics_power - chara.physics_defense;
	// 	chara.hp -= damage;
	// 	System.out.println(this.name + " の攻撃！");
    // 	System.out.println(damage + " のダメージ！");
    // 	System.out.println(chara.name + " のHP：" + chara.hp);
	// 	return chara;
	// }

	// 攻撃処理
	public Character attack(Character chara) {
		int damage = this.physics_power + this.item_power - chara.physics_defense;
		chara.hp -= damage;

		// 過剰ダメージ処理
		if (chara.hp < 0) {
			chara.hp = 0;
		} else {
			break;
		}

		// テキスト出力
		System.out.println(this.name + " の攻撃！");
		System.out.println(damage + " のダメージ！");
		System.out.println(this.name + " のHP：" + this.hp);
		System.out.println(chara.name + " のHP：" + chara.hp);
		System.out.println();
		return chara;
	}

	// 回復
	public void use_potion1() { // 傷薬 (hpが10回復)
    	Potion heal = new Potion();
    	hp = heal.potion1(this.name, this.potion_num, this.hp, this.hp_max);
    }
	
	public void use_potion2() { // 調合薬 (hpが20回復)
    	Potion heal = new Potion();
    	hp = heal.potion1(this.name, this.potion_num, this.hp, this.hp_max);
    }
	
	public void use_potion3() { // 特効薬 (hpが40回復)
    	Potion heal = new Potion();
    	hp = heal.potion1(this.name, this.potion_num, this.hp, this.hp_max);
    }
}
