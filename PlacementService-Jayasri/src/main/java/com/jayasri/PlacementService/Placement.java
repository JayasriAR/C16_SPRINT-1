package com.sarthika.PlacementService;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="placementDate")
	private Date placementDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getPlacementDate() {
		return placementDate;
	}
	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(int id, String companyName, Date placementDate) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.placementDate = placementDate;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyName=" + companyName + ", placementDate=" + placementDate + "]";
	}
	
}
