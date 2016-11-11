package com.test;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("people")
public class People {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getAllPeople() {

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("people", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("name", "Greg").add("phone", "+123456789").add("email", "greg@test.com").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "2").add("name", "Steve").add("phone", "+444567890").add("email", "steve@test.com").add("country", "UK"))
                        .add(Json.createObjectBuilder().add("id", "3").add("name", "Eva").add("phone", "+4656789012").add("email", "eva@test.com").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "4").add("name", "Pascal").add("phone", "+33678901234").add("email", "pascal@test.com").add("country", "1477394375")))
                .build();
    }

}
