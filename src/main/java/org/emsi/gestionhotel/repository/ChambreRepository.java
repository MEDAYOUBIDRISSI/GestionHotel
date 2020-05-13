package org.emsi.gestionhotel.repository;

import java.util.Collection;

import org.emsi.gestionhotel.entity.CategorieChambre;
import org.emsi.gestionhotel.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChambreRepository extends JpaRepository<Chambre, Integer>{
	public  Chambre findById(long id);
	
	
	// les chambres  : 
	@Query("SELECT cat.libelle,c.description,c.prix FROM Chambre c JOIN c.categorieC cat")
	public Collection<?> getCategories();
	
	@Query("SELECT cat FROM Chambre c JOIN c.categorieC cat WHERE c.id = :idChambre")
	public CategorieChambre getCategorieByNumeroChambre(@Param("idChambre") long idChambre);
	
}
