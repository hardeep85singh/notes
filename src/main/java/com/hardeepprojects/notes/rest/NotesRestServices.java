package com.hardeepprojects.notes.rest;

import com.hardeepprojects.notes.model.Note;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/notes")
public class NotesRestServices {

    private Map<String, Note> inventory = new HashMap<>();

    @POST
    @Path("/create")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response createNote(Note note){
        System.out.println("Creating note");

        inventory.put(note.getID(), note);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/read")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Note readNote(@QueryParam("id") String id){
        System.out.println("Reading note");

        if(inventory.containsKey(id)){
            return inventory.get(id);
        } else {
            return null;
        }
    }

    @PUT
    @Path("/update")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateNote(Note note){
        System.out.println("Updating note");

        if(inventory.get(note.getID()) == null) {
            return Response.status(Response.Status.NOT_MODIFIED)
                    .entity("Note is not in the database.\nUnable to update").build();
        } else {
            inventory.put(note.getID(), note);
            return Response.status(Response.Status.OK).build();
        }
    }

    @DELETE
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
    public Response deleteNote(@QueryParam("id") String id){
        System.out.println("Deleting note");

        if(inventory.get(id) == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Note is not in database.\nUnable to delete")
                    .build();
        } else {
            inventory.remove(id);
            return Response.status(Response.Status.OK).build();
        }
    }

}

