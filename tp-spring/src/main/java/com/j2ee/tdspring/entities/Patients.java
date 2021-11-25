package com.j2ee.tdspring.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;


@Entity
@Table(name="patients")
public class Patients {
	
	
		@Id
    	@Column(name="id", unique=true, nullable=false)
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
    	public int id;

	 	@Valid
	    @Column(name="Username")
	    private String username;
	 	

	 	@Valid
	    @Column(name="Firstname")
	    private String firstname;
	 	
	 	public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		@Valid
	    @Column(name="Lastname")
	    private String lastname;
	 	
	 	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}



}
