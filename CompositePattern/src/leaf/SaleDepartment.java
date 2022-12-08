package leaf;

import component.Department;

public class SaleDepartment implements Department{
	private int id;
	private String name;
	
	public SaleDepartment(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
