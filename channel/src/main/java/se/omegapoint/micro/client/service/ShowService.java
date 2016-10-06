package se.omegapoint.micro.client.service;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.omegapoint.micro.client.domain.show.DetailedShow;
import se.omegapoint.micro.client.domain.show.Show;
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
        throw new NotImplementedException("IMPLEMENT ME. Plzz.");
    }

    /**
     * TODO: Uppgift 4.
     * TODO: Hämta DetailedShow från showRepository. (Sök efter id)
     */
    public DetailedShow getShow(int id) {
        List<DetailedShow> listOfShows = showRepository.getDetailedShows();
        throw new NotImplementedException("IMPLEMENT ME.");
    }
}
