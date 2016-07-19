package me.lotus.lotuscore.services;

import me.lotus.lotuscore.entity.Family;

public class MembershipRegisterEntryRow extends RegisterEntryRow {

	private Family family;

	public MembershipRegisterEntryRow(Family family) {
		this.family = family;
	}

	public Family getFamily() {
		return family;
	}

}
