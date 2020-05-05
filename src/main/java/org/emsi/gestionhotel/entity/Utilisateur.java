package org.emsi.gestionhotel.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	private List<RoleUtilisateur> roles = new ArrayList<RoleUtilisateur>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	@JsonSetter
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleUtilisateur> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleUtilisateur> roles) {
		this.roles = roles;
	}
	public Utilisateur(long id, String username, String password, List<RoleUtilisateur> roles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
