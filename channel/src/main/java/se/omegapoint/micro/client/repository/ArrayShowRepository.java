package se.omegapoint.micro.client.repository;

import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.DetailedShow;
import se.omegapoint.micro.client.domain.Show;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArrayShowRepository implements ShowRepository{

    private List<DetailedShow> detailedShowList;

    public ArrayShowRepository() {
        this.detailedShowList = new ArrayList<>();
        detailedShowList.add(DetailedShow.newBuilder()
                .description("This is a cool program. Watch it!")
                .genre("Sport")
                .id(1)
                .startTime(LocalDateTime.now())
                .title("Sport program")
                .year(2006)
                .build());
    }

    /**
     *  TODO: Uppfigt 3.
     */
    @Override
    public List<Show> getShows() {

        return listOfdetailedShowToShowList(detailedShowList);

        //Tips: kolla på listOfdetailedShowToShowList().
        //throw new NotImplementedException("IMPLEMENT ME, PLEASE!");
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
     * @param listOfdetailedShow List of DetailedShow object
     * @return List of Show object
     */
    private List<Show> listOfdetailedShowToShowList(List<DetailedShow> listOfdetailedShow) {
        return listOfdetailedShow
                .stream()
                .map(detailedShow -> new Show(detailedShow.id, detailedShow.title, detailedShow.startTime))
                .collect(Collectors.toList());
    }

}
