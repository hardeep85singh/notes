package com.hardeepprojects.notes.service;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class NotesRepoImpl implements NotesRepo {

    private Map<String, Note> noteMap = new HashMap<String, Note>();

    @Override
    public void create(Note note) {
        String id = note.getID();
        noteMap.put(id, note);
    }

    @Override
    public Note read(String id) {
        return noteMap.get(id);
    }

    @Override
    public void update(Note note) {

        Iterator iterator = noteMap.keySet().iterator();

        while(iterator.hasNext()){

        }


        String id = note.getID();
        noteMap.replace(id, note);
    }

    @Override
    public void delete(Note note) {
        noteMap.remove(note.getID());
    }
}
