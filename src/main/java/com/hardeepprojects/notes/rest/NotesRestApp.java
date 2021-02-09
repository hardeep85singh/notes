//package com.hardeepprojects.notes.rest;
//import com.hardeepprojects.notes.model.*;
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//@Path("/notes")
//public class NotesRestApp {
//    NotesRepoImpl notesRepo = new NotesRepoImpl();
//
//    @POST
//    @Path("/create")
//    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
//    public Response createNote(Note note){
//        notesRepo.create(note);
//        return Response.status(Response.Status.CREATED).build();
//    }
//
//    @GET
//    @Path("/read")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
//    public Note readNote(@QueryParam("id") String id){
//        return notesRepo.read(id);
//    }
//
////    @PUT
////    @Path("/update")
////    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
////    public Response updateNote(Note note){
////        System.out.println("Updating note");
////        notesRepo.update(note);
//////        return Response.status();
////    }
//
//    @DELETE
//    @Path("/delete")
//    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
//    public Response deleteNote(@QueryParam("id") String id){
//        System.out.println("Deleting note");
//        return Response.status(Response.Status.OK).build();
//    }
//
//}
