package se.omegapoint.micro.client.domain;

import java.util.List;

public class ChannelInfo {

    private final String channelName;
    private final List<Author> authors;

    public ChannelInfo(String channelName, List<Author> authors) {
        this.channelName = channelName;
        this.authors = authors;
    }

    public String getChannelName() {return channelName;}
    public List<Author> getAuthors() {return authors;}

}
