package pages.backend.enums;

public enum Password {
	ADMIN_PASSWORD("parola"),
	TEACHER_PASSWORD("teacherpass"),
	GUEST_PASSWORD("guestpass"),
	NON_EXISTING_PASSWORD("sdlkafjsalkdfjasldkfj");
	
	private String password;
	
	private Password(String password){
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
