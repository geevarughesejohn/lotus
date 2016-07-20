package me.lotus.lotuscore.entity.register;

import me.lotus.lotuscore.entity.common.DeathDetails;
import me.lotus.lotuscore.entity.common.Person;

class DeathRegisterEntryRow extends RegisterEntryRow {

	private Person person;

	public DeathRegisterEntryRow(Person person, DeathDetails deathDetails) {
		this.person = person;
		this.person.setDeathDetails(deathDetails);
		this.person.getFamily().markDeath(this.person);
	}

}
