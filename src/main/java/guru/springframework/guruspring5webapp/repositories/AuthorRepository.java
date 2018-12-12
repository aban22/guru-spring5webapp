package guru.springframework.guruspring5webapp.repositories;

import guru.springframework.guruspring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
