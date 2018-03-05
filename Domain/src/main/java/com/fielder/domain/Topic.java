package com.fielder.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Topic")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Topic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5595541570414476516L;
	
	@Id
	@GeneratedValue
	private Integer id;	
	
	private String title;	
	private String description;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn (name="categoryId")
//	private Category category;	
	
//	@OneToMany (mappedBy="topic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Comment> comments;	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}

//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
	
}
