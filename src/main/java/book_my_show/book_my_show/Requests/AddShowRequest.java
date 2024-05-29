package book_my_show.book_my_show.Requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AddShowRequest {

    private LocalDate showDate;
    @Schema(description = "Time of the show in HH:mm:ss format", example = "19:00:00")
    private LocalTime showTime;

    private String movieName;
    private Integer theaterId;

}