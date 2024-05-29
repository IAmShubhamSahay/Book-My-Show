package book_my_show.book_my_show.Repositories;

import book_my_show.book_my_show.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show,Integer> {

}