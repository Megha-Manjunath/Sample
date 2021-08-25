package Distance;

public class Asset {
	int ID;
	Address add1;
	double area;
	Farmer owner;
	
	public Asset(int iD, Address add1, double area) {
		super();
		ID = iD;
		this.add1 = add1;
		this.area = area;
	}	
	public Farmer getOwner() {
		return owner;
	}
	public void setOwner(Farmer owner) {
		this.owner = owner;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Address getAdd1() {
		return add1;
	}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	
	
	

}
