package se.omegapoint.micro.client.controller.shows;

import com.fasterxml.jackson.annotation.JsonProperty;
import se.omegapoint.micro.client.domain.show.Show;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class GetShowsResponse {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    @JsonProperty("shows")
    public final List<ShowDTO> showDTOList;

    public GetShowsResponse(List<ShowDTO> showDTOList) {
        this.showDTOList = showDTOList;
    }

    public static GetShowsResponse from(List<Show> shows) {
        List<ShowDTO> showDTOs = shows.stream().map(show ->
                ShowDTO.showDTO()
                .id(show.id.value)
                .title(show.title.value)
                .startTime(show.startTime.format(DATE_FORMATTER))
                .build()).collect(Collectors.toList());
        return new GetShowsResponse(showDTOs);
    }

}
