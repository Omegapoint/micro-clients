package se.omegapoint.micro.client.controller.shows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import se.omegapoint.micro.client.domain.show.DetailedShow;
import se.omegapoint.micro.client.domain.show.Show;
import se.omegapoint.micro.client.service.ShowService;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ShowService showService;

    /**
     TODO: Uppgift 3 - Hitta vilket repository som används för att hämta tv-program och lägg till era program där.

     * This endpoint returns information about the currently running shows.
     *
     * @return List of Show objects.
     */
    @RequestMapping(value = "/shows", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetShowsResponse shows() {
        List<Show> shows = showService.getShows();
        GetShowsResponse showsResponse = GetShowsResponse.from(shows);
        return showsResponse;
    }

    /**
     * TODO: Uppift 4.
     */
    @RequestMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetDetailedShowResponse showDetails(@RequestParam("id") int id) {
        DetailedShow detailedShow = showService.getShow(id);
        return GetDetailedShowResponse.from(detailedShow);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AddResponseDTO addShow(final @RequestBody NewShowRequest newShowRequest) {
        return new AddResponseDTO(false, "Add not implemented!");
    }
}
