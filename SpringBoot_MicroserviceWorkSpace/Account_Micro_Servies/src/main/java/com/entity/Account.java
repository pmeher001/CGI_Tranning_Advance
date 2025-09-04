package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
@Id
private int accno;			// PK
private String name;
private float amount;
@Column(name = "emailid",unique = true)  // unique key created 
private String emailId;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

}
