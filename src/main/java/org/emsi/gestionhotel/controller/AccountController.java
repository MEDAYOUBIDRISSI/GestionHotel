package org.emsi.gestionhotel.controller;

import org.emsi.gestionhotel.entity.Utilisateur;
import org.emsi.gestionhotel.model.RegisterForm;
import org.emsi.gestionhotel.repository.UtilisateurRepository;
import org.emsi.gestionhotel.service.AccoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	private AccoutServiceImpl accoutServiceImpl;
	
	@PostMapping("/register")
	public Utilisateur register(@RequestBody RegisterForm registerUser) {
		if(!registerUser.getPassword().equals(registerUser.getRepassword())) 
			throw new RuntimeException("You must be confirm your password !");
		else if(accoutServiceImpl.findUtilisateurByUsername(registerUser.getUsername()) != null)
			throw new RuntimeException("Sorry username already exists , please try again with another !");
		else {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setUsername(registerUser.getUsername());
			utilisateur.setPassword(registerUser.getPassword());
			accoutServiceImpl.saveUtilisateur(utilisateur); // save user
			accoutServiceImpl.addRoleToUtilisateur(registerUser.getUsername(), "USER"); // save role to user
			return utilisateur;
		}
	}
	@GetMapping("/login")
	public Utilisateur login(@RequestBody Utilisateur u) {
		return accoutServiceImpl.saveUtilisateur(u);
	}
}
