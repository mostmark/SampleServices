package com.airhacks;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("greetings")
public class Greetings {
    
    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject sayHello(@PathParam("name") String name){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("message", "Hello there " + name + "!")
                .build();
    }
    
    @GET
    @Path("/goodbye/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject sayGoodbye(@PathParam("name") String name){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("message", "Goodbye " + name + "!")
                .build();
    }

}
