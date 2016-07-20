package me.lotus.lotuscore.services.o;

import me.lotus.lotuscore.services.BapitsamRegister;
import me.lotus.lotuscore.services.DeathRegister;
import me.lotus.lotuscore.services.MembershipRegister;
import me.lotus.lotuscore.services.VivahaRegister;

public class RegisterKeeper {

	private MembershipRegister membershipRegister;
	private BapitsamRegister bapitsamRegister;
	private VivahaRegister vivahaRegister;
	private DeathRegister deathRegister;

	public void getInstance() {
		// TODO Auto-generated method stub

	}

	private RegisterKeeper() {

		membershipRegister = new MembershipRegister();
		bapitsamRegister = new BapitsamRegister();
		vivahaRegister = new VivahaRegister();
		deathRegister = new DeathRegister();
	}

	public BapitsamRegister getBapitsamRegister() {
		return bapitsamRegister;
	}

	public DeathRegister getDeathRegister() {
		return deathRegister;
	}

	public MembershipRegister getMembershipRegister() {
		return membershipRegister;
	}

	public VivahaRegister getVivahaRegister() {
		return vivahaRegister;
	}

}
