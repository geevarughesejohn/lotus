package me.lotus.lotuscore.services;

import java.util.Date;

import me.lotus.lotuscore.entity.Family;

class MembershipRegisterEntryRow extends RegisterEntryRow {

	private Family family;

	private Date activeFrom;

	private Date activeTo;

	public MembershipRegisterEntryRow(Family family) {
		this.family = family;
	}

	public Family getFamily() {
		return family;
	}

	public Date getActiveFrom() {
		return activeFrom;
	}

	public void setActiveFrom(Date activeFrom) {
		this.activeFrom = activeFrom;
	}

	public Date getActiveTo() {
		return activeTo;
	}

	public void setActiveTo(Date activeTo) {
		this.activeTo = activeTo;
	}

}
