package listDemo;

import java.util.List;

public class Hospital {
	private int id;
	private List<String>departments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
}
