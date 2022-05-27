package entities;

public class Product {
	
	private Integer id;
	private String name;
	private Double sal;
	
	public Product(String name, Integer id, Double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	public void setSalary(Double salary) {
		this.sal = salary;
	}
	
	public void increaseSalary(double percentage) {
		sal += sal * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", sal);
	}
	
}	


