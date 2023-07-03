
public class Person {
	private String name;
	private String surname;
	private String phoneNumber;
	private String eMailAddress;
	
	public Person(String name, String surname, String phoneNumber, String eMailAddress) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.eMailAddress = eMailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", phoneNumber=" + phoneNumber + ", eMailAddress="
				+ eMailAddress + "]";
	}
	
	

}
