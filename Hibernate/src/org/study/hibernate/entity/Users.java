package org.study.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "user_id")
	int userId;

	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "first_name")
	String firstname;

	@Column(name = "last_name")
	String Lastname;

	public Users(int userId, String username, String password, String firstname, String lastname) {
		
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		Lastname = lastname;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

}
