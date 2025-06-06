package priciplesOfOops;

public class Sim {
	String servicePro;
	String nwType;
	String type;
	long simNo;
	
	public Sim() {
		// TODO Auto-generated constructor stub
	}
	
	Sim(String sp, String nwType, String type, long simNo){
		
		servicePro=sp;
		this.nwType=nwType;
		this.type=type;
		this.simNo=simNo;
	}
	
	public void displaySim()
	{
		System.out.println(servicePro);
		System.out.println(nwType);
		System.out.println(type);
		System.out.println(simNo);
	}
	
}
