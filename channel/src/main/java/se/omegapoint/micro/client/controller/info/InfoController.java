package se.omegapoint.micro.client.controller.info;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.omegapoint.micro.client.domain.Author;
import se.omegapoint.micro.client.domain.ChannelInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * This Rest Controller manage HTTP requests concerning information about the channel.
 */
@RestController
public class InfoController {

    public static final String CHANNEL_NAME = "NEW_CHANNEL";
    private final ChannelInfo channelInfo;

    //Set up information about the channel
    public InfoController() {
        List<Author> channelAuthors = new ArrayList<>();
        channelAuthors.add(new Author("Batman"));
        channelAuthors.add(new Author("Robin"));
        this.channelInfo = new ChannelInfo(CHANNEL_NAME, channelAuthors);
    }

    /**
     * Endpoint for returning channel information.
     *
     * @return ChannelInfo object as json
     *
     * TODO: Uppgift 1 - Returnera information om er kanal. (Glöm inte att även ändra i application.yml)
     */
    @RequestMapping(value = "/channelInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ChannelInfo channelInfo(){
        return this.channelInfo;
    }

    /**
     * Endpoint for returning viewer statistics.
     *
     * @return Integer the number of current viewers
     *
     * TODO: Uppgift 5 - Returnera information om antalet tittar just nu.
     */
    @RequestMapping(value = "/viewers", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer currentViewers(){
        return 1337;
    }


}
