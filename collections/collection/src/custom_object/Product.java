package custom_object;

public class Product implements Comparable{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "Product [id= "+id+ " , name= "+name+" , price= "+price+"]";
	}
	@Override
	public int compareTo(Object obj) {
		Product p=(Product)obj;
//		if(this.price<p.price)
//			return 1;
//		else if(this.price>p.price)
//			return -1;
//		else
//			return 0;
		return (-1*(this.name.compareTo(p.name)));//for string based comparssion
	}
}