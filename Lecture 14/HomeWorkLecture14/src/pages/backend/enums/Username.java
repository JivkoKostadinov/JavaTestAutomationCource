package pages.backend.enums;

public enum Username {
	ADMIN("admin"),
	TEACHER("teacher"),
	GUEST("guest1231"),
	NON_EXISING_USER("asdjklfjasdlkf");
	
	private String username;
	
	private Username(String username){
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
