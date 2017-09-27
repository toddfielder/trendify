//package com.fielder.model;
//
//import java.util.Collection;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//
//@Entity
//public class TrendsetterUser implements UserDetails {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//
//	private String username;
//
//	private String password;
//
//	private boolean enabled;
//
//	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinTable(joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
//	private Set<TrendsetterRole> roles;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//
//	public Set<TrendsetterRole> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<TrendsetterRole> roles) {
//		this.roles = roles;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return AuthorityUtils.createAuthorityList("ROLE_USER");
//		//return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//}
