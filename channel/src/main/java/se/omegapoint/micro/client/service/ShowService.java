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
        List<Show> shows = showRepository.getShows();
        return shows;
    }

    public DetailedShow getShow(int id) {

        /**
         * Uppgift 4.
         *
         * Hämta DetailedShow från showRepository. (Sök efter id)
         */
        throw new NotImplementedException("IMPLEMENT ME, HARD.");
    }
}
