package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag green = new TeaBag("green");
		Kettle k = new Kettle();
		k.boil();
		Cup c = new Cup();
		c.makeTea(green, k.getWater());
	}

}
