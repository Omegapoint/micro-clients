package se.omegapoint.micro.client.repository;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArrayShowRepository implements ShowRepository{

    /**
     * The detailedShowList acts as data storage instead of a database.
     * Add information about your shows here.
     */
    private List<DetailedShow> detailedShowList;

    public ArrayShowRepository() {
        this.detailedShowList = new ArrayList<>();
    }

    /**
     *  TODO: Uppgift 3.
     */
    @Override
    public List<Show> getShows() {
        //Tips: kolla på listOfdetailedShowToShowList().
        throw new NotImplementedException("IMPLEMENT ME, PLEASE!");
    }

    /**
     *
     * @return List of Detailed Shows
     */
    public List<DetailedShow> getDetailedShows(){
        return detailedShowList;
    }

    /**
     * Help function for converting DetailedShow to Show
     *
     * @param listOfDetailedShow List of DetailedShow object
     * @return List of Show object
     */
    private List<Show> listOfdetailedShowToShowList(List<DetailedShow> listOfDetailedShow) {
        return listOfDetailedShow
                .stream()
                .map(detailedShow -> new Show(detailedShow.id, detailedShow.title, detailedShow.startTime))
                .collect(Collectors.toList());
    }

}
