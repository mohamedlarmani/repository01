package coo.develhope.apispringrepository01.repositories;

import coo.develhope.apispringrepository01.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepositories extends JpaRepository<Car, Long>{
}
