package main;

import component.Department;
import composite.HeadDepartment;
import composite.SoftWartDepartment;
import leaf.FinanceDepartment;
import leaf.SaleDepartment;
import leaf.TesterDepartment;

public class MainMethod {
	public static void main(String[] args) {
		Department saleDepartment = new SaleDepartment(1, "Sale department");
		Department financeDepartment = new FinanceDepartment(2, "Finance department");
		Department testDepartment = new TesterDepartment(3, "Test department");
		
		SoftWartDepartment softWartDepartment = new SoftWartDepartment(4, "Software department");
		
		softWartDepartment.addDepartment(testDepartment);
		
		HeadDepartment headDepartment = new HeadDepartment(5, "Head department");
		
		headDepartment.addDepartment(saleDepartment);
		headDepartment.addDepartment(softWartDepartment);
		headDepartment.addDepartment(financeDepartment);
		
		headDepartment.printDepartmentName();
		softWartDepartment.printDepartmentName();
	}
}
