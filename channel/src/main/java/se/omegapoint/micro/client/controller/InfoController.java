package se.omegapoint.micro.client.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.omegapoint.micro.client.domain.Author;
import se.omegapoint.micro.client.domain.ChannelInfo;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {

    public static final String CHANNEL_NAME = "NEW_CHANNEL";
    private final ChannelInfo channelInfo;

    public InfoController() {
        List<Author> channelAuthors = new ArrayList<>();
        channelAuthors.add(new Author("Batman"));
        channelAuthors.add(new Author("Robin"));
        this.channelInfo = new ChannelInfo(CHANNEL_NAME, channelAuthors);
    }

    @RequestMapping(value = "/channelInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ChannelInfo channelInfo(){
        return this.channelInfo;
    }

}
