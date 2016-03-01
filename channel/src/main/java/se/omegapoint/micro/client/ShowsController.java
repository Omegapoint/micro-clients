package se.omegapoint.micro.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShowsController {

    @RequestMapping(value = "/shows", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Show> runningShows(){

//        LocalDateTime localDateTime = LocalDateTime.now();

        List<Show> currentlyRunningShows = new ArrayList<>();
        currentlyRunningShows.add(new Show("test", "17.00"));
        currentlyRunningShows.add(new Show("test2", "1.00"));
        return currentlyRunningShows;

    }


    @RequestMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public Show runningShow(){
        return new Show("test", "17.00");
    }

}
