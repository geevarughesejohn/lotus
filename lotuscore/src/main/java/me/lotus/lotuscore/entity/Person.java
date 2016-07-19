package me.lotus.lotuscore.entity;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private Gender gender;
	private int age;
	private Education education;
	private Occupation occupation;

	private Person father;
	private Person mother;
	private Map<Person, List<Person>> spouseAndChildren;
	private Family family;

}
