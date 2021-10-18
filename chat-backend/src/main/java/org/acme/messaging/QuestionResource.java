package org.acme.messaging;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/question")
public class QuestionResource {


    @GET
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void persistQuestion(@QueryParam("questionValue") String questionValue) {
        Question question = new Question();
        question.setValue(questionValue);
        question.persist();
    }

}
