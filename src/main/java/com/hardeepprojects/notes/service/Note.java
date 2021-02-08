package com.hardeepprojects.notes.service;

public class Note {

    private String id;
    private String title;
    private String description;

    public Note(String id, String title){
        this.id = id;
        this.title = title;
    }

    public Note(String id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getID(){
        return id;
    }

    public void setId(String id){
        this.id =id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return String.format("%s%s%n%s%s%n", "Title: ", getTitle(),
                "Description: ", getDescription());
    }

}
