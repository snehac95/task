package com.xworkz.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="valantine")
public class ValentineEntity implements Serializable{
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Id
	@Column(name="v_id")
	private int vid;
	@Column(name="v_name")
	private String name;
	@Column(name="v_status")
	private String status;
	@Column(name="v_gift")
	private String gift;
	
	public ValentineEntity() {
System.out.println("created \t"+this.getClass().getSimpleName());
	}

	public int getId() {
		return vid;
	}

	public void setId(int id) {
		this.vid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "ValentineEntity [id=" + vid + ", name=" + name + ", status=" + status + ", gift=" + gift + "]";
	}

	public ValentineEntity(String name, String status, String gift) {
		super();
		this.vid=vid;
		this.name = name;
		this.status = status;
		this.gift = gift;
	}
}