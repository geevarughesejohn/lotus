package me.lotus.lotuscore.entity.register;

import java.util.Date;

import me.lotus.lotuscore.entity.common.Family;

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
