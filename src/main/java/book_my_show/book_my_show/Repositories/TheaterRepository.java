package book_my_show.book_my_show.Repositories;

import book_my_show.book_my_show.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
}

