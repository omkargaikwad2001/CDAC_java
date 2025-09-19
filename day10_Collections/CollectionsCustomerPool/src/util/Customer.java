package util;

import java.util.Objects;

public class Customer {
	
	private String name;
	private int id;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "\nCustomer [name=" + name + ", id=" + id + "]";
	}
	

}
