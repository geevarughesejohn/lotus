package me.lotus.lotuscore.entity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private Gender gender;
	private BirthDetails birthDetails;
	private Education education;
	private Occupation occupation;
	private DeathDetails deathDetails;

	private Person father;
	private Person mother;
	private Map<Person, List<Person>> spouseAndChildren;
	private Family family;

	public Person(String name, Gender gender) {
		this(name, gender, -1);
	}

	public Person(String name, Gender gender, int age) {
		this.name = name;
		this.gender = gender;
		this.spouseAndChildren = new LinkedHashMap<Person, List<Person>>();
	}

	private void setFather(Person father) {
		this.father = father;
	}

	private void setMother(Person mother) {
		this.mother = mother;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public void addSpouseAndChildren(Person spouse, List<Person> children) {
		this.spouseAndChildren.put(spouse, children);
		for (Person child : children) {
			this.setParent(this, spouse);
		}
	}

	public void setParent(Person person, Person spouse) {
		if (person.getGender() == gender.male) {
			this.setFather(person);
			this.setMother(spouse);
		} else if (person.getGender() == gender.female) {
			this.setMother(person);
			this.setFather(spouse);
		}

	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return 0;
	}

	public Education getEducation() {
		return education;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public Person getFather() {
		return father;
	}

	public Person getMother() {
		return mother;
	}

	public Map<Person, List<Person>> getSpouseAndChildren() {
		return spouseAndChildren;
	}

	public Family getFamily() {
		return family;
	}

	public void setDeathDetails(DeathDetails deathDetails) {
		this.deathDetails = deathDetails;
	}

}
