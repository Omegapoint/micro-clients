package se.omegapoint.micro.client.domain.show;


import java.util.Objects;

public class Description {

    public final String value;

    public Description(String value) {
        if(value == null || "".equals(value)){
            throw new IllegalArgumentException("Description may not be blank");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description description = (Description) o;
        return Objects.equals(value, description.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
