package book_library.repository;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book_library.entity.Book;


//@Repository // marks this class as repository and it is managed by spring
//not required is already a managed component and since BookRepository is inherited from it,it also becomes
//a managed component
public interface BookRepository extends JpaRepository<Book,Integer> {

	
	
}
