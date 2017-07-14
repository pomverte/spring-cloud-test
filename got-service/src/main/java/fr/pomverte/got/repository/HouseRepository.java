package fr.pomverte.got.repository;

import fr.pomverte.got.model.House;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "houses", path = "houses")
public interface HouseRepository extends PagingAndSortingRepository<House, Long> {
}
