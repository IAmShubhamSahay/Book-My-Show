package book_my_show.book_my_show.Repositories;

import book_my_show.book_my_show.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,String> {
}
