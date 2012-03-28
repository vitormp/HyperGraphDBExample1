package com.vitormp.person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.vitormp.pet.Pet;

public class Person {

	private String name;
	private String age;
	private Set<Person> friends;
	private Set<Pet> pets;
	
	public Person(String name, String age){
		setName(name);
		setAge(age);
		this.friends = new HashSet<Person>();
		this.pets = new HashSet<Pet>();
	}

	public Person(String name, String age, Person... friends){
		this(name, age);
		addFriends(friends);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Set<Person> getFriends() {
		return friends;
	}

	public void addFriends(Person... friends) {
		this.friends.addAll(Arrays.asList(friends));
	}
	
	public void removeFriend(Person friend){
		this.friends.remove(friend);
	}

	public Set<Pet> getPets() {
		return pets;
	}
	
	public void addPets(Pet... pets) {
		this.pets.addAll(Arrays.asList(pets));
	}
	
	public void removePet(Pet pet){
		this.pets.remove(pet);
	}
}
