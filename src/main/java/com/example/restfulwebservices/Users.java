package com.example.restfulwebservices;

import java.time.LocalDateTime;

public class Users {
	
  private int id;
  private String name;
  private LocalDateTime birthDate;
  
  
  public Users(int id, String name, LocalDateTime birthDate) {
	super();
	this.id = id;
	this.name = name;
	this.birthDate = birthDate;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDateTime getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDateTime birthDate) {
	this.birthDate = birthDate;
}
  
}
