package me.lotus.lotuscore.entity;

import java.util.LinkedList;
import java.util.List;

public class Family {
	private Address address;
	private Person head;
	private List<Person> members;

	private Family parentFamily;
	private List<Family> childFamilies;

	public Family(Person head, Address address) {
		this.head = head;
		this.address = address;
		this.members = new LinkedList<Person>();
		this.childFamilies = new LinkedList<Family>();
	}

	public void addMemeber(Person person) {
		this.members.add(person);
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
		return head;
	}

	public Family getParentFamily() {
		return parentFamily;
	}

	public List<Family> getChildFamilies() {
		return childFamilies;
	}

	public List<Person> getMembers() {
		return members;
	}
}
