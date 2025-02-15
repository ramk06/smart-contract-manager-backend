package com.scm.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "users")
public class User {
	@Id
	private String id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true, nullable = false)

	private String email;

	private String password;

	@Lob
	private String about;

	@Column(length = 1000)
	private String profilePicture;

	private String phoneNumber;

	private boolean enabled = false;

	private boolean emailVerified = false;
	private boolean phoneVerified = false;

	@Enumerated(value = EnumType.STRING)
	private Providers provider = Providers.SELF;
	
	private String emailToken;
	
	
}
