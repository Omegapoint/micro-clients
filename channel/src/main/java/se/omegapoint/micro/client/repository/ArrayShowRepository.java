package se.omegapoint.micro.client.repository;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArrayShowRepository implements ShowRepository{

    List<DetailedShow> detailedShowList = new ArrayList<>();

    @Override
    public List<Show> getShows() {
        /**
         * Uppfigt 3
         */
        throw new NotImplementedException("IMPLEMENT ME, PLEASE!");
    }

    @Override
    public DetailedShow getShow(int id) {
        throw new NotImplementedException("IMPLEMENT ME, POR FAVOR!");
    }

    private Show detailedShowToShow(DetailedShow detailedShow) {
        return new Show(detailedShow.id, detailedShow.title, detailedShow.startTime);
    }

}
