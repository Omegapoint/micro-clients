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

    public static final String CHANNEL_NAME = "Fancy TV";
    private final ChannelInfo channelInfo;

    //Set up information about the channel
    public InfoController() {
        List<Author> channelAuthors = new ArrayList<>();
        channelAuthors.add(new Author("Hulken"));
        this.channelInfo = new ChannelInfo(CHANNEL_NAME, channelAuthors);
    }

    @RequestMapping(value = "/channelInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ChannelInfo channelInfo(){
        return this.channelInfo;
    }

}
