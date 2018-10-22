package pl.gvethon.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Tomasz Balawajder
 */
@RepositoryRestResource
interface BeerRepository extends JpaRepository<Beer, Long> {


}
