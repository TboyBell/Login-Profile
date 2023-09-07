package WorkersCalendar;

public class LoginDetails {
	

	private String name; 
	private String email;
	private String password;
	
	LoginDetails (String name, String email, String password) {
		this.setname(name);
		this.setemail(email);
		this.setpassword(password);
		
		
		
	}
	
	public String getname() {
		return name;
		
	}
	public String getemail() {
		return email;
		
	}
	public String getpassword() {
		return password;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setpassword(String password) {
		this.password = password;
	}
}
