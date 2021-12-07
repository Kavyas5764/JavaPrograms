package demo;

public class Car {
	String brandname;
	int price;
	
	

	public Car(String string, String string2) {
		// TODO Auto-generated constructor stub
	}



	public String getBrandname() {
		return brandname;
	}



	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public static void main(String args[]) {
	Car c = new Car("Audi","400000");
	System.out.println(c.getBrandname() +"" +c.price);
	}
}

