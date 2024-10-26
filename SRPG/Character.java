package SRPG;

public class Character {
	
	// ステータス値
	String name; // 名前
	int hp; // HP
	int physics_power; // 物理攻撃力
	int physics_defense; // 物理防御力
	int magic_power; // 魔法攻撃力
	int magic_defense; // 魔法防御力
	int speed; // 速さ
	int luck; // 幸運
	int tech; // 技
	int move; // 移動
	int lv; // レベル
	
	// 成長率に関して
	int glow_hp; // HP
	int glow_physics_power; // 物理攻撃力
	int glow_physics_defense; // 物理防御力
	int glow_magic_power; // 魔法攻撃力
	int glow_magic_defense; // 魔法防御力
	int glow_speed; // 速さ
	int glow_luck; // 幸運
	int glow_tech; // 技
	
	// コマンド処理

	// 攻撃
	public Character attack(Character chara) {
		int damage = this.power - chara.defense;
		chara.hp -= damage;
		System.out.println(this.name + " の攻撃！");
    	System.out.println(damage + " のダメージ！");
    	System.out.println(chara.name + " のHP：" + chara.hp);
		return chara;
	}

	// 回復
	public void use_potion1() {
    	Potion heal = new Potion();
    	hp = heal.potion1(hp); // 傷薬
    }
	
	public void use_potion2() {
    	Potion heal = new Potion();
    	hp = heal.potion2(hp); // 調合薬
    }
	
	public void use_potion3() {
    	Potion heal = new Potion();
    	hp = heal.potion3(hp); // 特効薬
    }
}
