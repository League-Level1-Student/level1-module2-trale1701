package _01_getters_and_setters;

public class taco {
	private String meat = "brown";
	private String sauce = "red";
	public String getMeat() {
		return meat;
	}
	public String getSauce(){
		return this.sauce;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

}
