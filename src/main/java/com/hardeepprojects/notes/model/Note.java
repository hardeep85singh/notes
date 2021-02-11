package com.hardeepprojects.notes.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notes", propOrder = {"id", "title", "description"})

public class Note {

    @FormParam("id") private int id;
    @FormParam("title") private String title;
    @FormParam("description") private String description;

    public Note() {
    }

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
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
        return getTitle().hashCode() + getDescription().hashCode();
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
        return String.format("%s%d%n%s%s%n%s%s%n", "ID: ", getID(), "Title: ", getTitle(),
                "Description: ", getDescription());
    }

}
