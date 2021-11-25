package com.j2ee.tdspring.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;


@Entity
@Table(name="messages")
public class Messages {
	
	
		@Id
    	@Column(name="id", unique=true, nullable=false)
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
    	public int id;

	 	@Valid
	    @Column(name="MessageContent")
	    private String messagecontent;
	 	

	 	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getMessagecontent() {
			return messagecontent;
		}


		public void setMessagecontent(String messagecontent) {
			this.messagecontent = messagecontent;
		}


		public String getLikes() {
			return likes;
		}


		public void setLikes(String likes) {
			this.likes = likes;
		}


		@Valid
	    @Column(name="Likes")
	    private String likes;
	 	
	 


}
