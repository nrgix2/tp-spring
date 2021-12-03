package com.j2ee.tdspring.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	    private int nb_patient;
	 	
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
	 	
	 	
	 	/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the auteur
		 */
		public String getAuteur() {
			return auteur;
		}

		/**
		 * @param auteur the auteur to set
		 */
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the creationdate
		 */
		public Date getCreationdate() {
			return creationdate;
		}

		/**
		 * @param creationdate the creationdate to set
		 */
		public void setCreationdate(Date creationdate) {
			this.creationdate = creationdate;
		}

		/**
		 * @return the cloturedate
		 */
		public Date getCloturedate() {
			return cloturedate;
		}

		/**
		 * @param cloturedate the cloturedate to set
		 */
		public void setCloturedate(Date cloturedate) {
			this.cloturedate = cloturedate;
		}

		/**
		 * @return the totalpatient
		 */
		public int getTotalpatient() {
			return totalpatient;
		}

		/**
		 * @param totalpatient the totalpatient to set
		 */
		public void setTotalpatient(int totalpatient) {
			this.totalpatient = totalpatient;
		}

		/**
		 * @return the forum
		 */
		public String getForum() {
			return forum;
		}

		/**
		 * @param forum the forum to set
		 */
		public void setForum(String forum) {
			this.forum = forum;
		}

		/**
		 * @return the motclef
		 */
		public String getMotclef() {
			return motclef;
		}

		/**
		 * @param motclef the motclef to set
		 */
		public void setMotclef(String motclef) {
			this.motclef = motclef;
		}



	
}
