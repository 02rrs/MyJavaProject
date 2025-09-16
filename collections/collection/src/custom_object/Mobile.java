package custom_object;

public class Mobile implements Comparable{
	int id;
	String brand;
	double price;
	int ram;
	public Mobile(int id,String brand,double price,int ram) {
		super();
		this.id=id;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
	}
	@Override
	public String toString() {
		return ("Mobile ["+"id "+id+" brand "+brand+" price "+price+" ram "+ram+"]");
	}
	@Override
	public int compareTo(Object obj) {
		Mobile m=(Mobile)obj;
		return (this.brand.compareTo(m.brand));
	}
}