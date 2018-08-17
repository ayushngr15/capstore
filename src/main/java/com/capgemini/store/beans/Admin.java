package com.capgemini.store.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL)
	private List<Merchant> merchants = new ArrayList<Merchant>();// one to many
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL)
	private List<Coupon> coupons = new ArrayList<Coupon>();// one to many
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL)
	private List<Discount> discounts = new ArrayList<Discount>();// one to many
	private String username;
	private String password;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Merchant> getMerchants() {
		return merchants;
	}
	public void setMerchants(List<Merchant> merchants) {
		this.merchants = merchants;
	}
	public List<Coupon> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	public List<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}
	
	
	
}
