package com.rejigl.spring5webapp.repositories;

import com.rejigl.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespository extends CrudRepository<Author, Long> {
}
