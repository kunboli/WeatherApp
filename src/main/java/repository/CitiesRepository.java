package repository;

import org.springframework.data.repository.CrudRepository;

import model.CitiesDTO;

public interface CitiesRepository extends CrudRepository<CitiesDTO, String> {
	

}
