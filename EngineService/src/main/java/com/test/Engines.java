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

@Path("engines")
public class Engines {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject engines(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
    public JsonObject getEnginesV1(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("car-model", "V90")
                .add("engines", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("brand", "Volvo").add("model", "D3 6-speed Manual").add("fuel-type", "Diesel").add("power", "150Hp / 320Nm"))
                        .add(Json.createObjectBuilder().add("id", "2").add("brand", "Volvo").add("model", "D3 6-speed Geartronic").add("fuel-type", "Diesel").add("power", "150Hp / 320Nm")))
                .build();
    }

    @GET
    @Path("/v1/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getEngineV1(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("car-model", "V90")
                .add("id", id)
                .add("brand", "Volvo")
                .add("model", "D4 6-speed Manual")
                .add("fuel-type", "Diesel")
                .add("power", "190Hp / 400Nm")
                .build();
    }

    @GET
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getEnginesV2(@HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("car-model", "V90")
                .add("engines", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("brand", "Volvo").add("model", "D3 6-speed Manual").add("fuel-type", "Diesel").add("power", "150Hp / 320Nm"))
                        .add(Json.createObjectBuilder().add("id", "2").add("brand", "Volvo").add("model", "D3 6-speed Geartronic").add("fuel-type", "Diesel").add("power", "150Hp / 320Nm"))
                        .add(Json.createObjectBuilder().add("id", "3").add("brand", "Volvo").add("model", "D4 6-speed Manual").add("fuel-type", "Diesel").add("power", "190Hp / 400Nm"))
                        .add(Json.createObjectBuilder().add("id", "4").add("brand", "Volvo").add("model", "D4 8-speed Geartronic").add("fuel-type", "Diesel").add("power", "190Hp / 400Nm"))
                        .add(Json.createObjectBuilder().add("id", "5").add("brand", "Volvo").add("model", "D4 8-speed Geartronic AWD").add("fuel-type", "Diesel").add("power", "190Hp / 400Nm"))
                        .add(Json.createObjectBuilder().add("id", "6").add("brand", "Volvo").add("model", "D5 8-speed Geartronic AWD").add("fuel-type", "Diesel").add("power", "235Hp / 480Nm"))
                        .add(Json.createObjectBuilder().add("id", "7").add("brand", "Volvo").add("model", "T5 8-speed Geartronic").add("fuel-type", "Petrol").add("power", "254Hp / 350Nm"))
                        .add(Json.createObjectBuilder().add("id", "8").add("brand", "Volvo").add("model", "T6 8-speed Geartronic AWD").add("fuel-type", "Petrol").add("power", "320Hp / 400Nm")))
                .build();
    }

    @GET
    @Path("/v2/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getEngineV2(@PathParam("id") int id, @HeaderParam("user-agent") String userAgent, @HeaderParam("X-3scale-proxy-secret-token") String secretToken, @HeaderParam("JWTAuthorization") String authorization) {
        
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
                .add("car-model", "V90")
                .add("id", id)
                .add("brand", "Volvo")
                .add("model", "T6 8-speed Geartronic AWD")
                .add("fuel-type", "Petrol")
                .add("power", "320Hp / 400Nm")
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
