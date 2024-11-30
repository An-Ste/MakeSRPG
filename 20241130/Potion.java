package SRPG;

public class Potion extends Item_info{
	
	public int potion1(String name, int potion_num, int hp, int hp_max) { // 傷薬
		potion_num = potion_num - 1;
                this.healing_num = 10;
                // HPを回復
                hp += healing_num;
                // オーバーヒール
                if (hp_max < hp) {
                        hp_gap = hp - hp_max;
                        hp = hp - hp_gap;
                } else {
                        // hp = hp + 0;
                        hp = hp;
                }
        
                System.out.println();
                System.out.println(name + " が傷薬を使用！");
                System.out.println("HPが 10 回復した！");
                System.out.println("現在のHP：" + hp);
                System.out.println();
                return hp;
        }
	
	public int potion2(String name, int potion_num, int hp, int hp_max) { // 調合薬
		potion_num = potion_num - 1;
                this.healing_num = 20;
                // HPを回復
                hp += healing_num;
                // オーバーヒール
                if (hp_max < hp) {
                        hp_gap = hp - hp_max;
                        hp = hp - hp_gap;
                } else {
                        hp = hp + 0;
                }

                System.out.println();
                System.out.println("調合薬を使用");
                System.out.println("HPが 20 回復した！");
                System.out.println("現在のHP：" + hp);
                System.out.println();
                return hp;
        }
    
	public int potion3(String name, int potion_num, int hp, int hp_max) { // 特効薬
		potion_num = potion_num - 1;
                this.healing_num = 40;
                // HPを回復
                hp += healing_num;
                // オーバーヒール
                if (hp_max < hp) {
                        hp_gap = hp - hp_max;
                        hp = hp - hp_gap;
                } else {
                        hp = hp + 0;
                }

                System.out.println();
                System.out.println("特効薬を使用");
                System.out.println("HPが 40 回復した！");
                System.out.println("現在のHP：" + hp);
                System.out.println();
                return hp;
        }
}
