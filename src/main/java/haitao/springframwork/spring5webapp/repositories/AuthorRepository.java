package haitao.springframwork.spring5webapp.repositories;

import haitao.springframwork.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
