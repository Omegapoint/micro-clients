package se.omegapoint.micro.client.controller.shows;

import com.fasterxml.jackson.annotation.JsonProperty;
import se.omegapoint.micro.client.domain.DetailedShow;

import java.time.format.DateTimeFormatter;

public class GetDetailedShowResponse {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    @JsonProperty("show")
    public final DetailedShowApi detailedShow;

    public GetDetailedShowResponse(DetailedShowApi detailedShow) {
        this.detailedShow = detailedShow;
    }

    public static GetDetailedShowResponse from(DetailedShow detailedShow){
        DetailedShowApi detailedShowApi = DetailedShowApi.newBuilder()
                .id(detailedShow.id)
                .description(detailedShow.description)
                .genre(detailedShow.genre)
                .title(detailedShow.title)
                .year(detailedShow.year)
                .startTime(detailedShow.startTime.format(DATE_FORMATTER))
                .build();
        return new GetDetailedShowResponse(detailedShowApi);
    }

}