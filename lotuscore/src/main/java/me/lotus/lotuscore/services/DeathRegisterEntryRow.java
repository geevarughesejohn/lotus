package me.lotus.lotuscore.services;

import me.lotus.lotuscore.entity.DeathDetails;
import me.lotus.lotuscore.entity.Person;

class DeathRegisterEntryRow extends RegisterEntryRow {

	private Person person;

	public DeathRegisterEntryRow(Person person, DeathDetails deathDetails) {
		this.person = person;
		this.person.setDeathDetails(deathDetails);
		this.person.getFamily().markDeath(this.person);
	}

}
