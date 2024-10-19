package SRPG;

public class Potion {
	
	public int potion1(int hp) {
		// 傷薬
        hp += 10;
        System.out.println("傷薬を使用");
        System.out.println("HPが 10 回復した！");
        System.out.println("現在のHP：" + hp);
        return hp;
	}
	
	public int potion2(int hp) {
		// 調合薬
        hp += 20;
        System.out.println("調合薬を使用");
        System.out.println("HPが 20 回復した！");
        System.out.println("現在のHP：" + hp);
        return hp;
	}
    
	public int potion3(int hp) {
		// 特効薬
        hp += 40;
        System.out.println("特効薬を使用");
        System.out.println("HPが 40 回復した！");
        System.out.println("現在のHP：" + hp);
        return hp;
	}
}
