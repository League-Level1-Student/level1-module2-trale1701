
public class tacoRunner {
	public static void main(String[] args) {
	person a = new person();
	a.setSuperPower("fly");
	a.setName("Alex");
	person b = new person();
	b.setSuperPower("super strong");
	b.setName("Bob");
	person c = new person();
	c.setSuperPower("super speed");
	c.setName("Chirs");
	
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
}
}
