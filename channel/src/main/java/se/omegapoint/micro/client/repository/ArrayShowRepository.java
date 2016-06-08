package se.omegapoint.micro.client.repository;

import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArrayShowRepository implements ShowRepository {

    /**
     * The detailedShowList acts as data storage instead of a database.
     * Add information about your shows here.
     */
    private List<DetailedShow> detailedShowList;

    public ArrayShowRepository() {
        this.detailedShowList = new ArrayList<>();
        DetailedShow show = DetailedShow.newBuilder().id(1)
                .description("My show!")
                .genre("horror")
                .startTime(LocalDateTime.now())
                .title("Horror Show!")
                .year(2016)
                .build();
        detailedShowList.add(show);
    }

    @Override
    public List<Show> getShows() {
        return listOfdetailedShowToShowList(detailedShowList);
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
                .map(detailedShow -> new Show(detailedShow.id, detailedShow.title, detailedShow.startTime))
                .collect(Collectors.toList());
    }

}
