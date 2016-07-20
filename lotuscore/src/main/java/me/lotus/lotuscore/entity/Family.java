package me.lotus.lotuscore.entity;

import java.util.LinkedList;
import java.util.List;

import me.lotus.lotuscore.services.IncomeClass;
import me.lotus.lotuscore.services.PrayerGroup;

public class Family {
	private Address address;
	private List<Person> livingMembers;
	private List<Person> diedMembers;

	private Family parentFamily;
	private List<Family> childFamilies;
	private PrayerGroup prayerGroup;
	private IncomeClass incomeClass;

	public Family(Person head, Address address) {
		this.address = address;
		this.livingMembers = new LinkedList<Person>();
		this.livingMembers.add(0, head);
		this.childFamilies = new LinkedList<Family>();
	}

	public void addMemeber(Person person) {
		this.livingMembers.add(person);
		person.setFamily(this);
	}

	public void addMemebers(List<Person> persons) {
		for (Person person : persons) {
			addMemeber(person);
		}
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setParentFamily(Family parentFamily) {
		this.parentFamily = parentFamily;
		parentFamily.addChildFamily(this);
	}

	public void addChildFamily(Family childFamily) {
		childFamilies.add(childFamily);
		childFamily.setParentFamily(this);
	}

	public Address getAddress() {
		return address;
	}

	public Person getHead() {
		return livingMembers.get(0);
	}

	public Family getParentFamily() {
		return parentFamily;
	}

	public List<Family> getChildFamilies() {
		return childFamilies;
	}

	public List<Person> getMembers() {
		return livingMembers;
	}

	public void markDeath(Person person) {
		removeMemeber(person);
		diedMembers.add(person);
	}

	public void removeMemeber(Person person) {
		livingMembers.remove(person);
	}
}
