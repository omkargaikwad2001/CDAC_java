package utility;

public class Students{
	
	private int sid;
	private String name;
	private String city;
	private float percentage;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int sid, String name, String city, float percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	
	@Override
	public int hashCode() {
		
		int code=0;
		
		if(this.city.equalsIgnoreCase("pune")) {
			code=10;
		}else if(this.city.equalsIgnoreCase("Mumbai")) {
			code=20;
		}else if(this.city.equalsIgnoreCase("Delhi")) {
			code=30;
		}else if(this.city.equalsIgnoreCase("Bangalore")) {
			code=40;
		}else {
			code=0;
		}
		
		return code;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean flag=false;
		Students s = (Students)o;
		if(this.city.equalsIgnoreCase(s.city) && this.sid==s.sid && this.name.equalsIgnoreCase(s.name) && this.percentage==s.percentage) {
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;
		
	}

	@Override
	public String toString() {
		return "\nStudents [sid=" + sid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]"+this.hashCode();
	}


	

}
