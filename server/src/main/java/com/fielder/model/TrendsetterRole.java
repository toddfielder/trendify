//package com.fielder.model;
//
//import javax.persistence.*;
//
//import java.util.Set;
//
// 
//@Entity
//public class TrendsetterRole {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    private String role;
//
//    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
//    private Set<TrendsetterUser> users;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public Set<TrendsetterUser> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<TrendsetterUser> users) {
//		this.users = users;
//	}
//
//    
//}