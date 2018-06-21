package com.self.java;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public interface SimpleResource {
    @GET
    @Path("helloworld")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response greet(@DefaultValue("world!") @QueryParam("name") String name);
}
