package book_my_show.book_my_show.Requests;

import book_my_show.book_my_show.Enums.Language;
import lombok.Data;

@Data
public class UpdateMovieRequest {

    private String movieName;
    private Language newLanguage;
    private Double newRating;

}
