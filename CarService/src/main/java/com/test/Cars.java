package com.test;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cars")
public class Cars {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject greetings() {
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("people", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("brand", "Volvo").add("model", "V70").add("year", "2010").add("released", "2006"))
                        .add(Json.createObjectBuilder().add("id", "2").add("brand", "Volvo").add("model", "V90").add("year", "2011").add("released", "2016"))
                        .add(Json.createObjectBuilder().add("id", "3").add("brand", "Volvo").add("model", "XC70").add("year", "2012").add("released", "2007"))
                        .add(Json.createObjectBuilder().add("id", "4").add("brand", "Volvo").add("model", "XC90").add("year", "2013").add("released", "2015")))
                .build();
    }

}
