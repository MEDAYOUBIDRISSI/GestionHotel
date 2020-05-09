package org.emsi.gestionhotel.entity;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ComptePaypal {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String username;
	private String email;
	// client
	@ManyToOne(fetch = FetchType.LAZY)
    private Client client;
	// facturation
	@OneToMany(mappedBy = "comptepaypal", cascade = CascadeType.ALL)
    private List<Facturation> facturations;
}
