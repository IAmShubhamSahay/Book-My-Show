package book_my_show.book_my_show.Repositories;

import book_my_show.book_my_show.Models.TheaterSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatsRepository extends JpaRepository<TheaterSeat,Integer> {
}
