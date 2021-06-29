package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_profiles")
public class UserProfile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String phoneNumber;
@Enumerated(EnumType.STRING)
private Gender gender;
@Temporal(TemporalType.DATE)
private Date dob;
private String adresse1,addresse2,city,state,street,country,zipcode;
@OneToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name="user_id",nullable = false)
private User user;



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public String getAdresse1() {
	return adresse1;
}

public void setAdresse1(String adresse1) {
	this.adresse1 = adresse1;
}

public String getAddresse2() {
	return addresse2;
}

public void setAddresse2(String addresse2) {
	this.addresse2 = addresse2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

}
