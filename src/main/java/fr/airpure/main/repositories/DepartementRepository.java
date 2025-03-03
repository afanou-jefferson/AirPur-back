package fr.airpure.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import fr.airpure.main.entities.Departement;

/**
 * The Interface DepartementRepository.
 */
public interface DepartementRepository extends JpaRepository<Departement, Integer>{
	Optional<Departement> findByNomDepartement(String nomDepartement);
	Optional<Departement> findByCodeDepartement(String codeDepartement);
}
