package se.omegapoint.micro.client.repository;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.show.DetailedShow;
import se.omegapoint.micro.client.domain.show.Show;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static se.omegapoint.micro.client.domain.show.Show.show;

/**
 * In memory implementation of a ShowRepository.
 */
@Repository
public class ArrayShowRepository implements ShowRepository {

    /**
     * The detailedShowList acts as data storage instead of a database.
     * Add harded information about your shows here.
     */
    private List<DetailedShow> detailedShowList;

    public ArrayShowRepository() {
        this.detailedShowList = asList(

        );
    }

    /**
     * TODO: Uppgift 3.
     */
    @Override
    public List<Show> getShows() {
        //Tips: kolla på listOfdetailedShowToShowList().
        throw new NotImplementedException("IMPLEMENT ME, PLEASE!");
    }

    /**
     * @return List of Detailed Shows
     */
    public List<DetailedShow> getDetailedShows() {
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
                .map(detailedShow -> show() .withId(detailedShow.id)
                                            .withTitle(detailedShow.title)
                                            .withStartTime(detailedShow.startTime).build())
                .collect(Collectors.toList());
    }

}
