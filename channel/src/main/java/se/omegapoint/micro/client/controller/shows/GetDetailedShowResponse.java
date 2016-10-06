package se.omegapoint.micro.client.controller.shows;

import com.fasterxml.jackson.annotation.JsonProperty;
import se.omegapoint.micro.client.domain.show.DetailedShow;

import java.time.format.DateTimeFormatter;

public class GetDetailedShowResponse {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    @JsonProperty("show")
    public final DetailedShowDTO detailedShow;

    public GetDetailedShowResponse(DetailedShowDTO detailedShow) {
        this.detailedShow = detailedShow;
    }

    public static GetDetailedShowResponse from(DetailedShow detailedShow){
        DetailedShowDTO detailedShowDTO = DetailedShowDTO.detailedShowDTO()
                .id(detailedShow.id.value)
                .description(detailedShow.description.value)
                .genre(detailedShow.genre.value)
                .title(detailedShow.title.value)
                .year(detailedShow.year.value)
                .startTime(detailedShow.startTime.format(DATE_FORMATTER))
                .build();
        return new GetDetailedShowResponse(detailedShowDTO);
    }

}
