package pl.gvethon.demo.beer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Tomasz Balawajder
 */
@RestController
public class BeerController {

	private BeerRepository repository;

	public BeerController(BeerRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/good-beers")
	@CrossOrigin("http://localhost:3000")
	public Collection<Beer> goodBears() {
		return repository.findAll().stream()
				.filter(this::isGreat)
				.collect(Collectors.toList());
	}

	private boolean isGreat(Beer beer) {
		return !beer.getName().equals("Budweiser") &&
				!beer.getName().equals("Coors Light") &&
				!beer.getName().equals("PBR");
	}
}
