package me.lotus.lotuscore.services;

import java.util.Date;

import me.lotus.lotuscore.entity.Address;
import me.lotus.lotuscore.entity.Gender;
import me.lotus.lotuscore.entity.Person;

public class BapitsamRegister extends Register<BapitsamRegisterEntryRow> {

	public BapitsamRegister() {

	}

	public Person addBapitsamDetails(String name, Gender gender, Person father,
			Person mother, Date dateofBirth, Date bapitsamDate) {

		Person person = addBapitsamDetails(name, gender, father.getName(),
				mother.getName(), father.getFamily().getAddress(), dateofBirth,
				bapitsamDate);
		person.setParent(person, mother);
		father.getFamily().addMemeber(person);
		return person;

	}

	public Person addBapitsamDetails(String name, Gender gender,
			String fatherName, String motherName, Address addess,
			Date dateofBirth, Date bapitsamDate) {

		Person person = new Person(name, gender);
		BapitsamRegisterEntryRow row = new BapitsamRegisterEntryRow(person,
				bapitsamDate);
		row.setFatherName(fatherName);
		row.setMotherName(motherName);
		row.setAddress(addess);
		super.addRow(row);
		return person;

	}
}
