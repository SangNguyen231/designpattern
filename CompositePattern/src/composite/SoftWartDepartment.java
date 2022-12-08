package composite;

import java.util.ArrayList;
import java.util.List;

import component.Department;

public class SoftWartDepartment implements Department{

	private int id;
	private String name;
	
	private List<Department> chilDepartments;
	
	public SoftWartDepartment(int id,String name) {
		this.id = id;
		this.name = name;
		this.chilDepartments = new ArrayList<>();
	}
	
	@Override
	public void printDepartmentName() {
		System.out.println("HEAD " + getName());
		for(Department department : chilDepartments) {
			System.out.println(department.getName());
		}
	}
	
	public void addDepartment(Department department) {
		chilDepartments.add(department);
	}
	
	public void removeDepartment(Department department) {
		chilDepartments.remove(department);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
