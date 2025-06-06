package priciplesOfOops;

public class Mobile {
	
	String brand;
	String name;
	double price;
	String type;
	Sim s;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	Mobile(String brand, String name, double price, String type){
		
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.type=type;
		
	}
	
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
	}
	
	public void insertSim(String sp, String nwType, String type, long simNo)
	{
		Sim s= new Sim(sp, nwType, type, simNo);
		System.out.println("Sim inserted");
	}

}
