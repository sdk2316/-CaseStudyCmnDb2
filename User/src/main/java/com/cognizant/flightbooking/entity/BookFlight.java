package com.cognizant.flightbooking.entity;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name="bookflight")
public class BookFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	private Integer pnr=  new Random().nextInt(99999999);
	
	@NotBlank
	@Size(max = 20)
	private String userFirstName;

	@NotBlank
	@Size(max = 10)
	private String userLastName;
	
	
	@NotBlank
	@Size(max = 50)
	@Email
	private String email;
	
	@NotBlank
	private String gender;
	
	@Size(min=1,max = 3)
	private Integer age;

	@NotBlank
	@Size(max = 99)
	private String seat;
	
	@NotBlank
	private String meal;
	
	@NotBlank
	@Size(max = 50)
	private String address;

	public BookFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public BookFlight(Integer id, Integer pnr, String userFirstName, String userLastName, String email, String gender,
			Integer age, String seat, String meal, String address) {
		super();
		this.id = id;
		this.pnr = pnr;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.seat = seat;
		this.meal = meal;
		this.address = address;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Integer getPnr() {
		return pnr;
	}



	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}



	@Override
	public String toString() {
		return "BookFlight [id=" + id + ", pnr=" + pnr + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", email=" + email + ", gender=" + gender + ", age=" + age + ", seat=" + seat
				+ ", meal=" + meal + ", address=" + address + "]";
	}

	
	

}
