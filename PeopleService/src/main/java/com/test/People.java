package com.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("people")
public class People {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject people(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("Authorization") String authorization) {
        
        if(userAgent == null)
            userAgent = "";
        if(secretToken == null)
            secretToken = "";
        if(authorization == null)
            authorization = "";

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("hostname", getComputerName())
                .add("user-agent", userAgent)
                .add("X-3scale-proxy-secret-token", secretToken)
                .add("Authorization", authorization)
                .build();
    }

    @GET
    @Path("/v1")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPeopleV1(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("Authorization") String authorization) {
        
        if(userAgent == null)
            userAgent = "";
        if(secretToken == null)
            secretToken = "";
        if(authorization == null)
            authorization = "";

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("version", "1")
                .add("hostname", getComputerName())
                .add("user-agent", userAgent)
                .add("X-3scale-proxy-secret-token", secretToken)
                .add("Authorization", authorization)
                .add("people", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("name", "Greg").add("phone", "+123456789").add("email", "greg@test.com").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "2").add("name", "Steve").add("phone", "+444567890").add("email", "steve@test.com").add("country", "UK"))
                        .add(Json.createObjectBuilder().add("id", "3").add("name", "Eva").add("phone", "+4656789012").add("email", "eva@test.com").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "4").add("name", "Pascal").add("phone", "+33678901234").add("email", "pascal@test.com").add("country", "1477394375")))
                .build();
    }

    @GET
    @Path("/v1/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPersonV1(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("Authorization") String authorization) {
        
        if(userAgent == null)
            userAgent = "";
        if(secretToken == null)
            secretToken = "";
        if(authorization == null)
            authorization = "";

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("version", "1")
                .add("hostname", getComputerName())
                .add("user-agent", userAgent)
                .add("X-3scale-proxy-secret-token", secretToken)
                .add("Authorization", authorization)
                .add("id", id).add("name", "Greg").add("phone", "+123456789").add("email", "greg@test.com").add("country", "US")
                .build();
    }

    @GET
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPeopleV2(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("Authorization") String authorization) {
        
        if(userAgent == null)
            userAgent = "";
        if(secretToken == null)
            secretToken = "";
        if(authorization == null)
            authorization = "";

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("version", "2")
                .add("hostname", getComputerName())
                .add("user-agent", userAgent)
                .add("X-3scale-proxy-secret-token", secretToken)
                .add("Authorization", authorization)
                .add("people", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("name", "Bob").add("phone", "+198374548").add("email", "bob@test.com").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "2").add("name", "Brad").add("phone", "+4487435897").add("email", "brad@test.com").add("country", "UK"))
                        .add(Json.createObjectBuilder().add("id", "3").add("name", "Lisa").add("phone", "+4656253680").add("email", "lisa@test.com").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "4").add("name", "Lydie").add("phone", "+33678901234").add("email", "lydie@test.com").add("country", "FR"))
                        .add(Json.createObjectBuilder().add("id", "1").add("name", "Greg").add("phone", "+123456789").add("email", "greg@test.com").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "2").add("name", "Steve").add("phone", "+444567890").add("email", "steve@test.com").add("country", "UK"))
                        .add(Json.createObjectBuilder().add("id", "3").add("name", "Eva").add("phone", "+4656789012").add("email", "eva@test.com").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "4").add("name", "Pascal").add("phone", "+33678901234").add("email", "pascal@test.com").add("country", "FR")))
                .build();
    }

    @GET
    @Path("/v2/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPersonV2(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("Authorization") String authorization) {
        
        if(userAgent == null)
            userAgent = "";
        if(secretToken == null)
            secretToken = "";
        if(authorization == null)
            authorization = "";

        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("version", "2")
                .add("hostname", getComputerName())
                .add("user-agent", userAgent)
                .add("X-3scale-proxy-secret-token", secretToken)
                .add("Authorization", authorization)
                .add("id", id).add("name", "Eva").add("phone", "+4656789012").add("email", "eva@test.com").add("country", "SE")
                .build();
    }
    
    private String getComputerName() {
        try {
            return InetAddress.getLocalHost().getHostName() + ":" + InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return "unknown";
        }
    }

}
