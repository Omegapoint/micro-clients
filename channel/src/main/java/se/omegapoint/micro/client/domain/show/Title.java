package se.omegapoint.micro.client.domain.show;


import java.util.Objects;

public class Title {

    public final String value;

    public Title(String value) {
        if(value == null || "".equals(value)){
            throw new IllegalArgumentException("Title may not be blank");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(value, title.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
