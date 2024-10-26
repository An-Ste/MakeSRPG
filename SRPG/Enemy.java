package SRPG;

public class Enemy extends Character {

	public Enemy() {
		this.name = "敵ユニット";
		this.hp = 30;
		this.physics_power = 10;
		this.physics_defense = 10;
		this.magic_power = 10;
		this.magic_defense = 10;
		this.speed = 10;
		this.luck = 10;
		this.tech = 10;
		this.move = 4;
		this.lv = 3;
	}
}
