package se.omegapoint.micro.client.domain.show;


import java.util.Objects;


public class Id {

    public final int value;

    public Id(int value) {
        if(value <= 0){
            throw new IllegalArgumentException("Id may not be negative.");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id = (Id) o;
        return value == id.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
