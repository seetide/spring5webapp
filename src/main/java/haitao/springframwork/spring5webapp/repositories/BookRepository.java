package haitao.springframwork.spring5webapp.repositories;

import haitao.springframwork.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
