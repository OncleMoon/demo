package com.hongbo.demo.springmvc.domain;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "USER")
public class User extends BaseEntity{
	
	@Id
	@SequenceGenerator(name = "userGen", sequenceName = "USER_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "userGen")
	@Column(name = "id")
	private Long id;
	
	@Version
	@Column(name = "version")
	private Integer version;
	
	@Column(name = "email", length = 50, unique = true, nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "deleted")
	private boolean deleted = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public Map<String, String> validateEntity() {
		Boolean isSuccess = true;
		StringBuffer message = new StringBuffer("Validate User failed: ");
		if (this.email == null) {
			isSuccess = false;
			message.append("email must be not null.");
		}

		messages.put("isSuccess", isSuccess.toString());
		messages.put("message", isSuccess? "Validate User sucessed." : message.toString());
		return messages;
	}
}
