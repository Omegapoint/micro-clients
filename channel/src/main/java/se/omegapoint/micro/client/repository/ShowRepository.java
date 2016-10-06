package se.omegapoint.micro.client.repository;

import se.omegapoint.micro.client.domain.show.DetailedShow;
import se.omegapoint.micro.client.domain.show.Show;

import java.util.List;

public interface ShowRepository {

    List<Show> getShows();

    List<DetailedShow> getDetailedShows();

}
