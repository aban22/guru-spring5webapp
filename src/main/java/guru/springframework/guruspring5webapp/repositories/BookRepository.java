package guru.springframework.guruspring5webapp.repositories;

import guru.springframework.guruspring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
