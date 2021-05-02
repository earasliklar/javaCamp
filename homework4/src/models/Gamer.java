package models;

public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private String natioalĘdentity;
	private String birthDate;
	
	public Gamer(int gamerId, String firstName, String lastName, String natioalĘdentity, String birthDate) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioalĘdentity = natioalĘdentity;
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

	public String getNatioalĘdentity() {
		return natioalĘdentity;
	}

	public void setNatioalĘdentity(String natioalĘdentity) {
		this.natioalĘdentity = natioalĘdentity;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	

}
