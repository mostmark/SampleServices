package com.test;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ipas")
public class Ipas {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject ipas(){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", "UK")))
                .build();
        
    }
    
    @GET
    @Path("/country/{country}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getByCountry(@PathParam("country") String country){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", country))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", country)))
                .build();
        
    }

}
