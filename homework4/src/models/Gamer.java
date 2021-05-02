package models;

public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private String natioal›dentity;
	private String birthDate;
	
	public Gamer(int gamerId, String firstName, String lastName, String natioal›dentity, String birthDate) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioal›dentity = natioal›dentity;
		this.birthDate = birthDate;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNatioal›dentity() {
		return natioal›dentity;
	}

	public void setNatioal›dentity(String natioal›dentity) {
		this.natioal›dentity = natioal›dentity;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	

}
