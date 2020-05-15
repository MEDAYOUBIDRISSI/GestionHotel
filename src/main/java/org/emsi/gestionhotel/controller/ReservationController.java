package org.emsi.gestionhotel.controller;

import java.util.List;

import org.emsi.gestionhotel.entity.Employe;
import org.emsi.gestionhotel.entity.Reservation;
import org.emsi.gestionhotel.entity.Utilisateur;
import org.emsi.gestionhotel.repository.EmployeRepository;
import org.emsi.gestionhotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
@CrossOrigin(origins = "http://localhost:3000")
public class ReservationController {
	@Autowired
	private ReservationRepository reservationRepository;
	
	@GetMapping("/all")
	public List<Reservation> findAll(){
		return reservationRepository.findAll();
	}
	
	@PostMapping("/save")
	public Reservation save(@RequestBody Reservation e){
		return  reservationRepository.save(e); // return id
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Reservation e){
		if(reservationRepository.findById((int) e.getId()) != null) {
			reservationRepository.save(e);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
		if(reservationRepository.findById(Long.parseLong(id)) != null) {
			reservationRepository.delete(reservationRepository.findById(Long.parseLong(id)));
		}
	}
	
	/****************JPQL*****************/
	
	
	
}
