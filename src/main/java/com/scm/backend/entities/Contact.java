package com.scm.backend.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_contacts")
public class Contact {
	@Id
	private String id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String picture;
	@Lob
	private String description;
	private boolean favorite = false;
	private String websiteLink;
	private String linkedInLink;
	private String instagramLink;
	private String cloudinaryImagePublicId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
}