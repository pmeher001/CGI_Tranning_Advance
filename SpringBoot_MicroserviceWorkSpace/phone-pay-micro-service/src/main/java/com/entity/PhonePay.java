package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PhonePay {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ppid;
private int accno;
@Column(name = "emailid",unique = true)
private String emailId;
public int getPpid() {
	return ppid;
}
public void setPpid(int ppid) {
	this.ppid = ppid;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

}
