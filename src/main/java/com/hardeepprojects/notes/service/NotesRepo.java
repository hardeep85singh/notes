package com.hardeepprojects.notes.service;

public interface NotesRepo {

    void create(Note note);

    Note read(String id);

    void update(Note note);

    void delete(Note note);
}
