package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id  
private int pid;
private String pname;
private int price;
private int qty;
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
