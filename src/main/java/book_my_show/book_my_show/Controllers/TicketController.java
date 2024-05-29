package book_my_show.book_my_show.Controllers;

import book_my_show.book_my_show.Requests.BookTicketRequest;
import book_my_show.book_my_show.Responses.TicketResponse;
import book_my_show.book_my_show.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("bookTicket")
    public String bookTicket(@RequestBody BookTicketRequest bookTicketRequest){

        return ticketService.bookTicket(bookTicketRequest);
    }

    @GetMapping("generateTicket")
    public TicketResponse generateTicket(@RequestParam("ticketId") String ticketId) {

        return ticketService.generateTicket(ticketId);
    }
}
