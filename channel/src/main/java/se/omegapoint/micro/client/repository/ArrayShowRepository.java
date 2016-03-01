package se.omegapoint.micro.client.repository;

import org.springframework.stereotype.Repository;
import se.omegapoint.micro.client.domain.Show;
import se.omegapoint.micro.client.repository.ShowRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArrayShowRepository implements ShowRepository{

    private List<Show> listOfShows = new ArrayList<>();

    public ArrayShowRepository() {
        listOfShows.add(new Show("test", "17.00"));
        listOfShows.add(new Show("test2", "1.00"));
    }

    @Override
    public List<Show> getShows() {
        return listOfShows;
    }

    @Override
    public List<Show> getNumberOfShows(int numberOfShows) {
        return listOfShows.stream().limit(numberOfShows).collect(Collectors.toList());
    }

}
