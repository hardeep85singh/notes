package com.hardeepprojects.notes.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {"id", "title", "description"})

public class Note {

    private String id;
    private String title;
    private String description;

    public Note() {
    }

    public Note(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Note(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Note note = (Note) o;

        if (!Objects.equals(id, note.id)) {
            return false;
        }
        return Objects.equals(title, note.title);
    }

    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n", "ID: ", getID(), "Title: ", getTitle(),
                "Description: ", getDescription());
    }

}
