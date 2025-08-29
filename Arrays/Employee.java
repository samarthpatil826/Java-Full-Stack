package arrays;

public class Employee {
	
	String name;
	int empid;
	int deptNo;
	int managerNo;
	String hireDate;
	double sal;
	double comm;
	String job;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int empid, int deptNo, int managerNo, String job, String hireDate, double sal, double comm) {
		super();
		this.name = name;
		this.empid = empid;
		this.deptNo = deptNo;
		this.managerNo = managerNo;
		this.sal = sal;
		this.comm = comm;
		this.job = job;
		this.hireDate=hireDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", deptNo=" + deptNo + ", managerNo=" + managerNo
				+ ", job=" + job+", hireDate="+hireDate+ ", sal=" + sal + ", comm=" + comm+"]";
	}
	
	
}
