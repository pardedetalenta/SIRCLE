package com.sirclo.test.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "berat")
public class Berat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String date;
	@Column
	Integer beratMax;
	@Column
	Integer beratMin;
	@Column
	Integer perbedaan;
	
	public Berat() {
	}
	
	public Berat(Integer id, String date, Integer beratMax, Integer beratMin, Integer perbedaan) {
		super();
		this.id = id;
		this.date = date;
		this.beratMax = beratMax;
		this.beratMin = beratMin;
		this.perbedaan = perbedaan;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getBeratMax() {
		return beratMax;
	}
	public void setBeratMax(Integer beratMax) {
		this.beratMax = beratMax;
	}
	public Integer getBeratMin() {
		return beratMin;
	}
	public void setBeratMin(Integer beratMin) {
		this.beratMin = beratMin;
	}

	public Integer getPerbedaan() {
		return perbedaan;
	}

	public void setPerbedaan(Integer perbedaan) {
		this.perbedaan = perbedaan;
	}
	
	
	
}
