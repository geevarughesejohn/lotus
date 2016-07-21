package me.lotus.lotuscore.entity.register;

import java.util.Date;

import me.lotus.lotuscore.entity.common.Address;
import me.lotus.lotuscore.entity.common.Person;

public class KumbasaraRegisterEntryRow extends RegisterEntryRow {

	private String name;

	private Address address;

	private Person person;

	private Date date;

	public KumbasaraRegisterEntryRow(Person person, Date date) {
		this.person = person;
		this.date = date;
	}

	public KumbasaraRegisterEntryRow(String name, Address address, Date date) {
		this.name = name;
		this.address = address;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public Date getDate() {
		return date;
	}

	public Person getPerson() {
		return person;
	}

}
