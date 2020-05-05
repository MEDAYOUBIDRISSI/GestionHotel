package org.emsi.gestionhotel.service;

import org.emsi.gestionhotel.entity.RoleUtilisateur;
import org.emsi.gestionhotel.entity.Utilisateur;
import org.emsi.gestionhotel.repository.RoleUtilisateurRepository;
import org.emsi.gestionhotel.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccoutServiceImpl implements AccountService {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private RoleUtilisateurRepository roleUtilisateurRepository;
	@Override
	public Utilisateur saveUtilisateur(Utilisateur user) {
		String hashPW = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(hashPW);
		return utilisateurRepository.save(user);
	}

	@Override
	public RoleUtilisateur saveRole(RoleUtilisateur role) {
		return roleUtilisateurRepository.save(role);
	}

	@Override
	public void addRoleToUtilisateur(String username, String roleName) {
		RoleUtilisateur roleUtilisateur = roleUtilisateurRepository.findByRoleName(roleName);
		Utilisateur utilisateur  = utilisateurRepository.findByUsername(username);
		utilisateur.getRoles().add(roleUtilisateur);
	}

	@Override
	public Utilisateur findUtilisateurByUsername(String username) {
		return utilisateurRepository.findByUsername(username);
	}
	

}
