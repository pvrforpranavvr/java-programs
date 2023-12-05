package edu.pvr.programs.remove_duplicates.dto;

import java.util.Objects;

public record Person(String name, String place) {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return this.name.equalsIgnoreCase(person.name)
                && this.place.equalsIgnoreCase(person.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name.toLowerCase(), this.place.toLowerCase());
    }
}

