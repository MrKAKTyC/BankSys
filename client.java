
public class client {
	private String FirstName;
	private String LastName;
	private Integer id;
	
	public client(String firstName, String lastName, int id) {
		FirstName = firstName;
		LastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	

}
