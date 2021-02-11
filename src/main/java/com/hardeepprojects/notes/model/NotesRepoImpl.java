//package com.hardeepprojects.notes.model;
//import java.util.Map;
//import java.util.HashMap;
//
//public class NotesRepoImpl implements NotesRepo {
//
//    private Map<String, Note> noteMap = new HashMap<String, Note>();
//
//    @Override
//    public void create(Note note) {
//        String id = note.getID();
//        noteMap.put(id, note);
//    }
//
//    @Override
//    public Note read(String id) {
//        if(noteMap.containsKey(id)){
//            return noteMap.get(id);
//        } else {
//            throw new IllegalArgumentException("Note that you want to read is not present");
//        }
//    }
//
//    @Override
//    public void update(Note note) {
//
//    }
//
//    @Override
//    public void delete(String id) {
//        if (noteMap.get(id) == null){
//            throw new IllegalArgumentException("Note that you want to delete is not present");
//        } else {
//            noteMap.remove(id);
//        }
//    }
//}
