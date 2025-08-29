package arrays;

public class EmployeeDB {
	
	private String user;
	private String pass;
	
	private boolean connect= false;
	
	private Employee[]db= new Employee[10];
	
	private int count=0;
	private int index=0;
	
	private EmployeeDB() {
		
	}
	
	public EmployeeDB(String user, String pass) {
		this.user = user;
		this.pass = pass;
		
		System.out.println("Database Created !");
	}
	
	public void login(String user, String pass) {
		
		if (this.user.equals(user) && this.pass.equals(pass)) {
			connect=true;
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public boolean addEmployee(String name, int empid, int deptNo, int managerNo, String job, String hireDate, double sal, double comm) {
		
		if (connect && count<0.75*db.length) {
			
			db[index]=new Employee(name, empid, deptNo, managerNo, job, hireDate, sal, comm);
			
			count++;
			index++;
			
			return true;
		}
		
		else if (connect) {
			
			Employee [] temp= new Employee[db.length*2];
			
			for (int i = 0; i < db.length; i++) {
				
				temp[i]=db[i];
			}
			db= temp;
			
			db[index]= new Employee(name, empid, deptNo, managerNo, job, hireDate, sal, comm);
			
			count++;
			index++;
			
			return true;
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
			
			return false;
		}
	}
	
	public void showDB() {
		if (connect) {
			
			for (int i = 0; i < count; i++) {
				
				System.out.println(db[i]);
			}
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public void showByJob(String job) {
		
		boolean check=false;
		
		if (connect) {
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].job.equalsIgnoreCase(job)) {
					
					System.out.println(db[i]);
					check=true;
				}
			}
			if (!check) {
				System.out.println("no rows selected");
			}
		}
	}
	
	public void searchByDeptNo(int deptNo) {
		
		boolean check = false;
		if (connect) {
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].deptNo== deptNo) {
					
					System.out.println(db[i]);
					check= true;
				}
			}
			if (!check) {
				System.out.println("no rows selected");
			}
		}
	}
	
	public void searchBySalary(double sal, char ch) {
		
		if (connect) {
			
			boolean check= false;
			
			for (int i = 0; i < count; i++) {
				switch (ch) {
				case'>':
					if (db[i].sal>sal) {
						System.out.println(db[i]);
						check=true;
					}
					break;
					
				case'<':
					if (db[i].sal<sal) {
						System.out.println(db[i]);
						check=true;
					}
					break;
					
				case'=':
					if (db[i].sal==sal) {
						System.out.println(db[i]);
						check=true;
					}
					break;

				default:
					break;
				}
			}
			if (!check) {
				System.out.println("Invalid relational operator");
			}
		}
	}
	
	public void searchByManagerId(int managerid) {
		
		if (connect) {
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].managerNo == managerid) {
					
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByManagerName(String name) {
		
		boolean check= false;
		if (connect) {
			
			int id= searchName(name);
			
			if (id > 0) {
				
				for (int i = 0; i < count; i++) {
					
					if (id==db[i].managerNo) {
						
						System.out.println(db[i]);
						check=true;
					}
				}
				if (!check) {
					System.out.println("no rows selected");
				}
			}
		}
	}
	
	public void searchByCommission(double comm) {
		
		if (connect) {
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].comm == comm) {
					
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchNoManager() {
		
		if (connect) {
		
		boolean check= false;
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].managerNo < 0) {
					
					System.out.println(db[i]);
					check=true;
				}
			}
			if (!check) {
				
				System.out.println("no rows selected");
			}
		}
	}
	
	public void searchMaxSalary() {
		
		if (connect) {
			
			double secMaxSal=0;
			double maxSal=0;
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].sal > maxSal) {
					
					secMaxSal=maxSal;
					maxSal= db[i].sal;
				}
				
				else if (db[i].sal>secMaxSal) {
					
					secMaxSal=db[i].sal;
				}
			}
			
			System.out.println(maxSal);
			System.out.println(secMaxSal);
		}
		
	}
	
	public void searchByName(String name) {
		
		if (connect) {
			
			boolean check = false;
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].name==name) {
					
					check=true;
					System.out.println(db[i]);
				}
			}
			if (!check) {
				
				System.out.println("no rows selected");
				System.out.println(name+" name's employee not found");
			}
		}
	}
	
	public int searchName(String name) {
		
            if (connect) {
			
			boolean check = false;
			
			for (int i = 0; i < count; i++) {
				
				if (db[i].name.equals(name)) {
					
					check=true;
					return db[i].empid;
				}
			}
			if (!check) {
				
				System.out.println("Employee not found");
			}
		}
            return -1;
	}
	
	public void sortBy(String attri) {
		
		if (attri=="EmpId" || attri=="Salary" || attri=="managerNo" || attri=="deptNo" || attri=="Name") {
			
			for (int i = 0; i < count-1; i++) {
				
				for (int j = 0; j < count-1-i; j++) {
					
					if (checkSwap(db[j], db[j+1], attri)>0) {
						
						Employee temp=db[j];
						db[j]=db[j+1];
						db[j+1]=temp;
					}
				}
			}
		}
		else {
			System.out.println("Attribute is not comparable");
		}
	}
	
	private int checkSwap(Employee n1, Employee n2, String attri) {
		
		switch (attri) {
		case "EmpId":
		{
			return checkSwap0(n1.empid, n2.empid);
		}
		
		case "Salary":
		{
			return checkSwap0(n1.sal, n2.sal);
		}
		
		case "managerNo":
		{
			return checkSwap0(n1.managerNo, n2.managerNo);
		}
		
		case "deptNo":
		{
			return checkSwap0(n1.deptNo, n2.deptNo);
		}
		
		case "Name":
		{
			return n1.name.compareToIgnoreCase(n2.name);
		}

		default:
			return -1000;
		}
	}
	
	private int checkSwap0(double n1, double n2) {
		
		if (n1>n2) {
			
			return 1;
		}
		
		else if (n1<n2) {
			
			return -1;
		}
		
		return 0;
	}
}
