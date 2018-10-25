package com.verizon.adb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="connections")
public class Connection {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String title;
	private long netSpeed;
	private long maxUsagePerMonth;
	private long charges;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getNetSpeed() {
		return netSpeed;
	}
	public void setNetSpeed(Long netSpeed) {
		this.netSpeed = netSpeed;
	}
	public Long getMaxUsagePerMonth() {
		return maxUsagePerMonth;
	}
	public void setMaxUsagePerMonth(Long maxUsagePerMonth) {
		this.maxUsagePerMonth = maxUsagePerMonth;
	}
	public Long getCharges() {
		return charges;
	}
	public void setCharges(Long charges) {
		this.charges = charges;
	}
	
	
}
