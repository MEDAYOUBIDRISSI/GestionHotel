package org.emsi.gestionhotel.service;

import org.emsi.gestionhotel.entity.RoleUtilisateur;
import org.emsi.gestionhotel.entity.Utilisateur;

public interface AccountService {
	public Utilisateur saveUtilisateur(Utilisateur user);
	public RoleUtilisateur saveRole(RoleUtilisateur role);
	public void addRoleToUtilisateur(String username,String roleName);
	public Utilisateur findUtilisateurByUsername(String username);
}
