package _01_getters_and_setters;

public class runner {
	public static void main(String[] args) {
		person alex = new person();
		person bob = new person();
		person chirs = new person();
		
		alex.setName("alex");
		bob.setName("bob");
		chirs.setName("chirs");
		
		alex.setSuperpower("flight");
		bob.setSuperpower("super speed");
		chirs.setSuperpower("rich");
		
		System.out.println(alex.toString());
		System.out.println(bob.toString());
		System.out.println(chirs.toString());
		
	}
	
}
