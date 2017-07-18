package com.phani.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.phani.model.Message;
import com.phani.services.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService ms= new MessageService();
	@PathParam("msgId") private String id;
	
    @GET
	public List<Message> getMessages(){
		return ms.getAllMessages();
    }
    @GET
    @Path("/{msgId}")
    public Message getSingleMessage() {
    	return ms.getMessageById(id);
    }
    @POST
    public Message writeMessage(Message m){
    	return ms.writeNewMessage(m);
    }
        
}
