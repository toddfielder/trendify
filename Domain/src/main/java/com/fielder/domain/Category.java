package com.fielder.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "category")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Category extends DBProperties implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7990783376825858354L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	private String title;
	private String description;

	// @OneToMany (mappedBy="category", cascade = CascadeType.ALL, fetch =
	// FetchType.LAZY)
	// private List<Topic> topics;

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
	// @JsonIgnore
	// public List<Topic> getTopics() {
	// return topics;
	// }
	//
	// public void setTopics(List<Topic> topics) {
	// this.topics = topics;
	// }

}
