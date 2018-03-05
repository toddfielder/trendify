package com.fielder.service;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//package com.fielder.service;
//
//import java.util.HashSet;
import org.springframework.stereotype.Service;

import com.fielder.model.Person;
import com.fielder.model.UserHolder;

 
//@Transactional
@Service
public class UserService  {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
	private UserHolder appUser;
    
	public void assignPersonAndRoles(HttpServletRequest request) {
		
		System.out.println("------------assignPersonAndRoles-------------");
		
		
		Person p = new Person();
		p.setFirstName("Todd");
		p.setLastName("Fielder");
		p.setEmailAddress("todd.fielder@gmail.com");
		appUser.getUser().setPerson(p);
	}

//    private UserRepository userRepository;
//
//    public UserSecurityService(UserRepository userRepository){
//        this.userRepository=userRepository;
//    }
    
    
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        try {
//            TrendsetterUser user = userRepository.findByUsername(username);
//            if (user == null) {
//                LOGGER.debug("user not found with the provided username");
//                return null;
//            }
//            LOGGER.debug(" user from username " + user.toString());
//            
//            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
//        }
//        catch (Exception e){
//            throw new UsernameNotFoundException("User not found");
//        }
//    }
//
//    private Set<GrantedAuthority> getAuthorities(TrendsetterUser user){
//        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//        for(TrendsetterRole role : user.getRoles()) {
//            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
//            authorities.add(grantedAuthority);
//        }
//        LOGGER.debug("user authorities are " + authorities.toString());
//        return authorities;
//    }
//
//
}