package org.emsi.gestionhotel;

import java.util.stream.Stream;

import org.emsi.gestionhotel.entity.RoleUtilisateur;
import org.emsi.gestionhotel.entity.Utilisateur;
import org.emsi.gestionhotel.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class JwtSpringSecApplication implements CommandLineRunner {

	@Autowired
	private AccountService accountService;
	public static void main(String[] args)  {
		SpringApplication.run(JwtSpringSecApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		
		/*accountService.saveUtilisateur(new Utilisateur(0,"admin","123456",null));
		accountService.saveUtilisateur(new Utilisateur(0,"user","123456",null));
		accountService.saveRole(new RoleUtilisateur(0,"ADMIN"));
		accountService.saveRole(new RoleUtilisateur(0,"USER"));
		accountService.addRoleToUtilisateur("admin", "ADMIN");
		accountService.addRoleToUtilisateur("user", "USER");*/
		/*Stream.of("T1","T2","T3").forEach(t->{
			taskRespository.save(new Task(null, t));
		});*/
		
		/*taskRespository.findAll().forEach(r->{
			System.out.println(r);
		});*/
	}
}
