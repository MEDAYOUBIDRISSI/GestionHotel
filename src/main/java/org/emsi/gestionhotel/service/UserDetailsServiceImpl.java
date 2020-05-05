package org.emsi.gestionhotel.service;

import java.util.ArrayList;
import java.util.Collection;

import org.emsi.gestionhotel.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private AccountService accoutService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur user = accoutService.findUtilisateurByUsername(username);
		if(user == null) throw new UsernameNotFoundException(username);
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		user.getRoles().forEach(role ->{
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		});
		
		return new User(user.getUsername(),user.getPassword(),authorities);
	}

}
