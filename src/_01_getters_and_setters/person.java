package _01_getters_and_setters;

public class person {
	String name = "tra";
	String superpower = "telepathy";
	public String getName() {
		return name;
	}
	public String getSuperpower(){
		return this.superpower;
	}
	public void setName(String name) {
		 this.name =name;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	public String toString() {
		return name + " has mad " + superpower + " Skills.";
	}

}
