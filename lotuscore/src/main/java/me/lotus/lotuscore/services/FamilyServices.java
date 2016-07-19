package me.lotus.lotuscore.services;

import java.util.List;

import me.lotus.lotuscore.entity.Address;
import me.lotus.lotuscore.entity.Family;
import me.lotus.lotuscore.entity.Person;

public interface FamilyServices {

	void createFamily(Person head, Address address);

	void addMembers(Family family, List<Person> );

}