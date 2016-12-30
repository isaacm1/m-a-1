package auth;

public class Author {
	private String name;
	private String email;
	private char gender;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}
	public String toString() {
		
		if (gender == 'm'){
		return "This Author's name is " + name + ". His email address is " + email + ". His gender is " + gender;
		}else
			return "This Author's name is " + name + ", Her email address is " + email + ", Her gender is f";
	}
}
