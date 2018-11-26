package com.utecws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")
public class User implements Serializable{

private static final long serialVersionUID = 1L;
	public User() { super(); }
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	private long id;
	
	@Column(name="user")
	private String user;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rol")
	private long rol;
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", password=" + password + ", rol=" + rol + "]";
	}



	public User(String user, String password) {
		this.user = user;
		this.password = password;
	}



	public long getId() {
		return id;
	}
	
	

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getRol() {
		return rol;
	}

	public void setRol(long rol) {
		this.rol = rol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
