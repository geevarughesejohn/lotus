package me.lotus.lotuscore.entity;

import java.util.List;

public class Family {
	private Address address;
	private Person head;
	private List<Person> members;

	private Family parentFamily;
	private List<Family> childFamilies;

}
