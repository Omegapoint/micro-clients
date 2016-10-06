package se.omegapoint.micro.client.domain.show;


import java.util.Objects;

public class Year {

    public static final int FIRST_MOVIE_EVER_MADE = 1890;
    public static final int SOME_YEAR_IN_THE_VAST_FUTURE = 2200;
    public final int value;

    public Year(int value) {

        if(value < FIRST_MOVIE_EVER_MADE || value > SOME_YEAR_IN_THE_VAST_FUTURE){
            throw new IllegalArgumentException("Year "+value+" not allowed.");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Year year = (Year) o;
        return value == year.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
