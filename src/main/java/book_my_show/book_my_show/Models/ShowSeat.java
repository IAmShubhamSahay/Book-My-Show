package book_my_show.book_my_show.Models;

import book_my_show.book_my_show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "show_seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private Boolean isBooked;
    private Boolean isFoodAttached;

    @JoinColumn
    @ManyToOne
    private Show show;
}

