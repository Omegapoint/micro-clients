package se.omegapoint.micro.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.omegapoint.micro.client.domain.Show;
import se.omegapoint.micro.client.repository.ArrayShowRepository;

import java.util.List;

@Service
public class ShowService {

    private final ArrayShowRepository showRepository;

    @Autowired
    public ShowService(ArrayShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<Show> getShows() {
        List<Show> shows = showRepository.getShows();
        return shows;
    }

}
