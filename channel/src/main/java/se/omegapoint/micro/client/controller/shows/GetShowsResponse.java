package se.omegapoint.micro.client.controller.shows;

import com.fasterxml.jackson.annotation.JsonProperty;
import se.omegapoint.micro.client.domain.Show;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used to
 *
 * Created by PNTSCOMP on 2016-04-02.
 */
public class GetShowsResponse {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

    @JsonProperty("shows")
    public final List<ShowApi> showApiList;

    public GetShowsResponse(List<ShowApi> showApiList) {
        this.showApiList = showApiList;
    }

    public static GetShowsResponse from(List<Show> shows) {
        List<ShowApi> showApis = shows.stream().map(show ->
                ShowApi.newBuilder()
                .id(show.id)
                .title(show.title)
                .startTime(show.startTime.format(DATE_FORMATTER))
                .build()).collect(Collectors.toList());
        return new GetShowsResponse(showApis);
    }

}
