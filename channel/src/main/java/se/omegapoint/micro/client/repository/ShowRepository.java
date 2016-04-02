package se.omegapoint.micro.client.repository;

import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;

import java.util.List;

public interface ShowRepository {

    List<Show> getShows();

    List<DetailedShow> getDetailedShows();

}
