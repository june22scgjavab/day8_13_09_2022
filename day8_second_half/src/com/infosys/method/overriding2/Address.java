package com.infosys.method.overriding2;

public class Address {
private String houseNumber;
private String locality;
private String city;



public Address() {
	super();  // We are asking for the Object class constructor
	
}

public String getHouseNumber() {
	return houseNumber;
}

public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}

public String getLocality() {
	return locality;
}

public void setLocality(String locality) {
	this.locality = locality;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Address(String houseNumber, String locality, String city) {
	super();
	this.houseNumber = houseNumber;
	this.locality = locality;
	this.city = city;
}

}
