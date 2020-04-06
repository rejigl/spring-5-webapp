package com.rejigl.spring5webapp.bootstrap;

import com.rejigl.spring5webapp.domain.Address;
import com.rejigl.spring5webapp.domain.Author;
import com.rejigl.spring5webapp.domain.Book;
import com.rejigl.spring5webapp.domain.Publisher;
import com.rejigl.spring5webapp.repositories.AuthorRespository;
import com.rejigl.spring5webapp.repositories.BookRepository;
import com.rejigl.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRespository authorRespository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRespository authorRespository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRespository = authorRespository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author martinFowler = new Author("Martin", "Fowler");
        Book refactoring = new Book("Refactoring", "136578SB3");
        Address address = new Address("450 S Peachtree Pkwy", "Peachtree City", "GA", 30269);
        Publisher oreilly = new Publisher("OReilly", address);
        martinFowler.getBooks().add(refactoring);
        refactoring.getAuthors().add(martinFowler);

        authorRespository.save(martinFowler);
        bookRepository.save(refactoring);
        publisherRepository.save(oreilly);

        System.out.println("Bootstrapped");
        System.out.println("Number of Books = " + bookRepository.count());
    }
}
