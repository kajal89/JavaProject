package com.Hibernate.Hibernate_maven;

import java.security.Identity;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Student_address")
public class Address {

	@Id
//	used to incerement value automatically	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id") // used to change name of column
	private int AId;

	@Column(length = 150, name = "Street")
	private String street;
	private String city;
	private boolean isOpen;

	// used to not create a particular column in DB
	@Transient
	private double x;

	@Column(name = "Date")
	@Temporal(TemporalType.DATE) // used to set the date format
	private Date addedDate;

	@Lob
	private byte[] img;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int aId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] img) {
		super();
		AId = aId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.img = img;
	}

	public int getAId() {
		return AId;
	}

	public void setAId(int aId) {
		AId = aId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Address [AId=" + AId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", addedDate=" + addedDate + ", img=" + Arrays.toString(img) + "]";
	}

}
