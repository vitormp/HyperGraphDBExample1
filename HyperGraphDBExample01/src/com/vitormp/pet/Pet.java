package com.vitormp.pet;

import com.vitormp.person.Person;

public class Pet {

	private String name;
	private String age;
	private Person owner;
	
	private Pet(String name, String age, Person owner){
		setName(name);
		setAge(age);
		setOwner(owner);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
}
