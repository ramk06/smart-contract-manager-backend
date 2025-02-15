package com.scm.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	private String cloudinaryImagePublicId;
}
