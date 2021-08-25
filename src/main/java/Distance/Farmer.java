package Distance;

public class Farmer {
	
	int ID;
	Address add2;
	String name;
	public Farmer(int iD, Address add2, String name) {
		super();
		ID = iD;
		this.add2 = add2;
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Address getAdd2() {
		return add2;
	}
	public void setAdd2(Address add2) {
		this.add2 = add2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}