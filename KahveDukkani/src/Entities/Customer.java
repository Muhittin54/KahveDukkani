package Entities;
import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dateOfBirth;

	public Customer(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOFBirth) {
		this.dateOfBirth = dateOFBirth;
	}
}
