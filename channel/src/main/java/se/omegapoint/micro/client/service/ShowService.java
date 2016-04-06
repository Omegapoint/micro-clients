package se.omegapoint.micro.client.service;

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

    /**
     * TODO: Uppgift 4.
     * TODO: Hämta DetailedShow från showRepository. (Sök efter id)
     */
    public DetailedShow getShow(int id) {

        List<DetailedShow> listOfShows = showRepository.getDetailedShows();
        return listOfShows.stream().filter(show -> show.id == id).findFirst().get();

        /**
         * Uppgift 4.
         *
         *
         */
        //throw new NotImplementedException("IMPLEMENT ME, HARD.");
    }
}
