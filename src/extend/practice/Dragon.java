package extend.practice;

public class Dragon extends Monster {
	int damage ;
	public Dragon(String name) {
		this.name = name;
		this.hp = 300;
		this.offensive = 1;
		this.damage = offensive * Rand.get(10);

	}

	public void attack(Living target) {

		System.out.println(name + "が炎で攻撃！" + target.name + "に" +damage + "のダメージを与えた。");
		System.out.println("");
		target.hp = target.hp - damage;
	}

}
