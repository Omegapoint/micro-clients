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

    /**
     *  TODO: Uppfigt 3.
     */
    @Override
    public List<Show> getShows() {

        //Tips: kolla på detailedShowToShow().
        throw new NotImplementedException("IMPLEMENT ME, PLEASE!");
    }

    /**
     * TODO: Uppgift 4.
     *
     * @param id of the show to return
     * @return DetailedShow
     */
    @Override
    public DetailedShow getShow(int id) {
        throw new NotImplementedException("IMPLEMENT ME, POR FAVOR!");
    }

    /**
     * Help function for converting DetailedShow to Show
     *
     * @param detailedShow DetailedShow object
     * @return show Show object
     */
    private Show detailedShowToShow(DetailedShow detailedShow) {
        return new Show(detailedShow.id, detailedShow.title, detailedShow.startTime);
    }

}
