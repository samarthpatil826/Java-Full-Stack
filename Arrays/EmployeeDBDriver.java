package arrays;

public class EmployeeDBDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDB ed= new EmployeeDB("scott", "tiger");
		
		ed.login("scott", "tiger");
		
		ed.addEmployee("Smith", 7369, 20, 7902, "Clerk", "17/12/1980", 800.0, 0.0);
		ed.addEmployee("Allen", 7499, 30, 7698, "Salesman", "20/02/1981", 1600.0, 300.0);
		ed.addEmployee("Ward", 7521, 30, 7698, "Salesman", "22/02/1981", 1250.0, 500.0);
		ed.addEmployee("Jones", 7566, 20, 7839, "Manager", "02/04/1981", 2975.0, 1400.0);
		ed.addEmployee("Martin", 7564, 30, 7698, "Salesman", "28/09/1981", 1250.0, 1400.0);
		ed.addEmployee("Blake", 7698, 30, 7839, "Manager", "01/05/1981", 2850.0, 0.0);
		ed.addEmployee("Clark", 7782, 10, 7839, "Manager", "09/06/1981", 2450.0, 0.0);
		ed.addEmployee("Scott", 7788, 20, 7566, "Analyst", "19/04/1987", 3000.0, 0.0);
		ed.addEmployee("King", 7839, 10, -1, "President", "17/11/1981", 5000.0, 0.0);
		ed.addEmployee("Turner", 744, 30, 7698, "Salesman", "08/09/1981", 1500.0, 0.0);
		ed.addEmployee("Adams", 7876, 20, 7788, "Clerk", "23/05/1987", 1100.0, 0.0);
		ed.addEmployee("James", 7900, 30, 7698, "Clerk", "03/12/1981", 950.0, 0.0);
		ed.addEmployee("Ford", 7902, 20, 7566, "Analyst", "03/12/1981", 3000.0, 0.0);
		ed.addEmployee("Miller", 7934, 10, 7782, "Clerk", "23/01/1982", 1300.0, 0.0);
		
		//ed.showDB();
		
		//ed.showByJob("engineer");
		
		//ed.searchByDeptNo(20);
		
		//ed.searchBySalary(2975, ';');
		
		//ed.searchByManagerId(7698);
		
		//ed.searchMaxSalary();
		
		//ed.searchNoManager();
		
		//ed.searchByCommission(1400);
		
		//ed.searchByManagerName("Blake");
		
		//ed.searchByName("sam");
		
		ed.sortBy("Name");
		ed.showDB();
	}

}
