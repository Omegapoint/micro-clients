package se.omegapoint.micro.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.omegapoint.micro.client.domain.Show;
import se.omegapoint.micro.client.service.ShowService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShowController {

    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @RequestMapping(value = "/shows", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Show> runningShows() {
        List<Show> shows = showService.getShows();
        return shows;
    }

    @RequestMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public Show runningShow() {
        return new Show("test", "17.00");
    }

}
