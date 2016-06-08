package se.omegapoint.micro.client.controller.shows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;
import se.omegapoint.micro.client.service.ShowService;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private ShowService showService;

    /**
     * This endpoint returns information about the currently running shows.
     *
     * @return List of Show objects.
     */
    @RequestMapping(value = "/shows", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetShowsResponse shows() {
        List<Show> shows = showService.getShows();
        return GetShowsResponse.from(shows);
    }

    @RequestMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetDetailedShowResponse showDetails(@RequestParam("id") int id) {
        DetailedShow detailedShow = showService.getShow(id);
        return GetDetailedShowResponse.from(detailedShow);
    }
}
