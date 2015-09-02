package lt.roadrulestest.test.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String surname;
	
	@NotNull
	private String username;
	
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private Date dateJoined;
	
	/*
	 * Constructors
	 */
	public User() {
		
	}
	
	public User(String name, String surname,
			String username, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.email = email;
		this.password = password;
        this.dateJoined = new Date();
	}

	
	/*
	 * Getters and setters
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}
}
