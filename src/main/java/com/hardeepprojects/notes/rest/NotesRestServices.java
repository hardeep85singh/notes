package com.hardeepprojects.notes.rest;

import com.hardeepprojects.notes.model.Note;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/notes")
public class NotesRestServices {

    private Map<Integer, Note> inventory = new HashMap<>();

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNote(Note note) {
        System.out.println("Creating note");
        note.setID(note.hashCode());
        inventory.put(note.getID(), note);
        return Response.status(Response.Status.OK)
                .entity("Note Created").build();
    }

    @GET
    @Path("/read")
    @Produces(MediaType.APPLICATION_JSON)
    public Note readNote(@QueryParam("id") Integer id) {
        System.out.println("Reading note");

        if (inventory.containsKey(id)) {
            return inventory.get(id);
        } else {
//            throw NoteNotFoundException();
            return null;
        }
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateNote(@QueryParam("id") String id, Note note) {
        System.out.println("Updating note");
        int parseId = Integer.parseInt(id);
        if (!inventory.containsKey(parseId)) {
            return Response.status(Response.Status.NOT_MODIFIED)
                    .entity("Note is not in the database.\nUnable to update").build();
        } else {
            inventory.replace(parseId, note);
            return Response.status(Response.Status.OK).entity("Note Updated").build();
        }
    }

    @DELETE
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
    public Response deleteNote(@QueryParam("id") Integer id) {
        System.out.println("Deleting note");

        if (inventory.get(id) == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Note is not in database.\nUnable to delete").build();
        } else {
            inventory.remove(id);
            return Response.status(Response.Status.OK).entity("Note Deleted").build();
        }
    }

    @GET
    @Path("/listNotes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Note> listNotes() {

        return new ArrayList<>(inventory.values());
    }

}



//    @POST
//    @Path("/create")
//    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED})
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response createNote(@Form Note note) {
//        System.out.println("Creating note");
//
//        inventory.put(note.hashCode(), note);
//        return Response.status(Response.Status.CREATED).entity("Note Created").build();
//    }

