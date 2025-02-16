package com.scm.backend.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Contact> contacts = new LinkedHashSet<>();
	
	
}
