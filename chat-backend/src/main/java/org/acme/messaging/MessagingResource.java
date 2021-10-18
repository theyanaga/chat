package org.acme.messaging;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/message")
public class MessagingResource {

    @GET
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void persistMessage(@QueryParam("messageText") String messageText) {
        Message message = new Message();
        message.setValue(messageText);
        message.persist();
    }

    @GET
    @Path("/getAll")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessages() {
        return Message.listAll();
    }



}
