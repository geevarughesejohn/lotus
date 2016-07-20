package me.lotus.lotuscore.services;

import java.util.Date;

import me.lotus.lotuscore.entity.Address;
import me.lotus.lotuscore.entity.Person;

class VivahaRegisterEntryRow extends RegisterEntryRow {

	private Date date;

	private Person groom;

	private Person bride;

	private Address groomAddress;

	private Address brideAddress;

	public VivahaRegisterEntryRow(Person groom, Person bride, Date date) {
		this.groom = groom;
		this.bride = bride;
		this.groomAddress = groom.getFamily().getAddress();
		this.brideAddress = bride.getFamily().getAddress();
		groom.getFamily().addMemeber(bride);
		bride.getFamily().removeMemeber(bride);
		this.date = date;

	}

	public VivahaRegisterEntryRow(Person groom, Person bride,
			Address brideAddress, Date date) {
		this.groom = groom;
		this.bride = bride;
		this.groomAddress = groom.getFamily().getAddress();
		this.brideAddress = brideAddress;
		groom.getFamily().addMemeber(bride);
		this.date = date;

	}

}
