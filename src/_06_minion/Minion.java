package _06_minion;
public class Minion {
	private String name = "Jeff";
	private int eyes = 1;
	private String color = "yellow";
	private String master = "tra";
	
	Minion(String name, int eyes, String color, String master){
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	
	public String getName() {
		return this.name;
	}
	public int getEyes() {
		return this.eyes;
	}
	public String getColor() {
		return this.color;
	}
	public String getMaster() {
		return this.master;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setEyes(int eyes) {
		this.eyes=eyes;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setMaster(String master) {
		this.master=master;
	}
}
