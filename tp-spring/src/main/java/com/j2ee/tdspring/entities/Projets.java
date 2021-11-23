package com.j2ee.tdspring.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="projets")
public class Projets {
	
	 	@Id
	 	@Valid
	    @Column(name="Name")
	    private String name;

	 	@Valid
	    @Column(name="auteur", length=30, nullable=false)
	    private String auteur;

	 	@Valid
	    @Column(name="description", length=30, nullable=false)
	    private String description;
	 	
	 	@Valid
	    @Column(name="creationdate", length=30, nullable=false)
	    private Date creationdate;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="cloturedate", length=30, nullable=false)
	    private Date cloturedate;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="patient", length=30, nullable=false)
	    private int patient;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="totalpatient", length=30, nullable=false)
	    private int totalpatient;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="forum", length=30, nullable=false)
	    private String forum;

	 	@Valid
	 	@JsonIgnore
	    @Column(name="motclef", length=30, nullable=false)
	    private String motclef;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="requetelist", length=30, nullable=false)
	    private String requetelist;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="participantlist", length=30, nullable=false)
	    private String participantlist;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="abonneeslist", length=30, nullable=false)
	    private String abonneeslist;

}
