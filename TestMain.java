package x1;

interface CanFight {
	int i = 12;
	void fight();
}

class ActionCharacter implements CanFight {
	int a = 23;
	public void fight() {
		a++;
		System.out.println("Fight from ActionCharacter.");
		System.out.println("a = " + a);
	}
}
class Hero extends ActionCharacter {
	int b = 35;
	public void fight() {
		System.out.println("Fight from Hero.");
		a--;
		b++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
public class TestMain {
	public static void main(String[] args) {
		ActionCharacter h1 = new ActionCharacter();
		h1.fight();
		System.out.println(h1.i);
		System.out.println(h1.a);
		Hero h2 = new Hero();
		h2.fight();
		System.out.println(h2.i);
		System.out.println(h2.a);
		System.out.println(h2.b);
		System.out.println(CanFight.i);
	}
}
