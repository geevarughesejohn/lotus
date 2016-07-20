package me.lotus.lotuscore.services;

import java.util.Date;

import me.lotus.lotuscore.entity.Address;
import me.lotus.lotuscore.entity.Person;

class BapitsamRegisterEntryRow extends RegisterEntryRow {

	private Date date;

	private Person person;

	private String fatherName;

	private String motherName;

	private Address addess;

	public BapitsamRegisterEntryRow(Person person, Date date) {
		this.person = person;
		this.date = date;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setAddress(Address addess) {
		this.addess = addess;

	}

}
