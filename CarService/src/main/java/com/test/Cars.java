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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("cars")
public class Cars {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject cars(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("JWTAuthorization", authorization)
                .build();
    }

    @GET
    @Path("/v1")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getCarsV1(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("JWTAuthorization", authorization)
                .add("cars", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("brand", "Volvo").add("model", "V70").add("year", "2010").add("released", "2006"))
                        .add(Json.createObjectBuilder().add("id", "2").add("brand", "Auidi").add("model", "Super Model 3").add("year", "2017").add("released", "2017"))
                        .add(Json.createObjectBuilder().add("id", "3").add("brand", "BMW").add("model", "X3").add("year", "2017").add("released", "2098"))
                        .add(Json.createObjectBuilder().add("id", "4").add("brand", "Volvo").add("model", "XC90").add("year", "2013").add("released", "2015")))
                .build();
    }

    @GET
    @Path("/v1/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getCarV1(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("JWTAuthorization", authorization)
                .add("id", id)
                .add("brand", "Volvo")
                .add("model", "V70")
                .add("year", "2010")
                .add("released", "2006")
                .build();
    }

    @GET
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getCarsV2(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("JWTAuthorization", authorization)
                .add("cars", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("brand", "Volvo").add("model", "V70").add("year", "2010").add("released", "2006"))
                        .add(Json.createObjectBuilder().add("id", "2").add("brand", "Volvo").add("model", "V90").add("year", "2011").add("released", "2016"))
                        .add(Json.createObjectBuilder().add("id", "3").add("brand", "Volvo").add("model", "XC70").add("year", "2012").add("released", "2007"))
                        .add(Json.createObjectBuilder().add("id", "4").add("brand", "Volvo").add("model", "XC90").add("year", "2013").add("released", "2015")))
                .build();
    }

    @GET
    @Path("/v2/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getCarV2(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("JWTAuthorization", authorization)
                .add("id", id)
                .add("brand", "Volvo")
                .add("model", "V90")
                .add("year", "2016")
                .add("released", "2016")
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
