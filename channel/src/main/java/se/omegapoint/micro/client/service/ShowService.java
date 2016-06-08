package se.omegapoint.micro.client.service;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;
import se.omegapoint.micro.client.repository.ShowRepository;

import java.util.List;

@Service
public class ShowService {

    private final ShowRepository showRepository;

    @Autowired
    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<Show> getShows() {
        return this.showRepository.getShows();
    }

    public DetailedShow getShow(final Integer id) {
        List<DetailedShow> listOfShows = showRepository.getDetailedShows();
        return listOfShows.stream().filter(s -> id == s.id)
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple matching IDs");
                })
                .orElseThrow(() -> new IllegalArgumentException("No matching show for id " + id));
    }
}
