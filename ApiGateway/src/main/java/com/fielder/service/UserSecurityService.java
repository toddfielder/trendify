//package com.fielder.service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.transaction.Transactional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.fielder.model.TrendsetterRole;
//import com.fielder.model.TrendsetterUser;
//import com.fielder.repository.UserRepository;
//
// 
//@Transactional
//@Service
//public class UserSecurityService implements UserDetailsService {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(UserSecurityService.class);
//
//    private UserRepository userRepository;
//
//    public UserSecurityService(UserRepository userRepository){
//        this.userRepository=userRepository;
//    }
//
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
//}