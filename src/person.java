
public class person {
	private String name;
	private String superPower;
	
	public String getName() {return name;}
	public String getSuperPower() {return superPower;}
	
	public void setName(String nameType) {
		name = nameType;
	}
	public void setSuperPower(String superPowerType) {
		superPower = superPowerType;
	}
	
	public String toString() {
		return this.name + " has mad " + this.superPower + " skill!!!";
	}

}
