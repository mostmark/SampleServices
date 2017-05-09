package com.test;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ipas")
public class Ipas {
    
    @GET
    @Path("/v1/")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject ipasV1(){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Ziiiiiiiiipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Dubbel IPA").add("brewery", "Poppels Bryggeri").add("type", "British-American ALE").add("alcohol", "8.0% ABV").add("user-rating", "4.00").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "3").add("beer-name", "Lagunitas IPA").add("brewery", "Lagunitas Brewing Company").add("type", "British-American ALE").add("alcohol", "6.2% ABV").add("user-rating", "5.00").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "4").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", "UK")))
                .build();
        
    }
    
    @GET
    @Path("/v2/")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject ipasV2(){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Dubbel IPA").add("brewery", "Poppels Bryggeri").add("type", "British-American ALE").add("alcohol", "8.0% ABV").add("user-rating", "4.00").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "3").add("beer-name", "Lagunitas IPA").add("brewery", "Lagunitas Brewing Company").add("type", "British-American ALE").add("alcohol", "6.2% ABV").add("user-rating", "5.00").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "4").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "5").add("beer-name", "Dubbel IPA").add("brewery", "Poppels Bryggeri").add("type", "British-American ALE").add("alcohol", "8.0% ABV").add("user-rating", "4.00").add("country", "SE"))
                        .add(Json.createObjectBuilder().add("id", "6").add("beer-name", "Lagunitas IPA").add("brewery", "Lagunitas Brewing Company").add("type", "British-American ALE").add("alcohol", "6.2% ABV").add("user-rating", "5.00").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "7").add("beer-name", "Lagunitas IPA").add("brewery", "Lagunitas Brewing Company").add("type", "British-American ALE").add("alcohol", "6.2% ABV").add("user-rating", "5.00").add("country", "US"))
                        .add(Json.createObjectBuilder().add("id", "8").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", "UK")))
                .build();
        
    }
    
    @GET
    @Path("/v1/country/{country}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getByCountryV1(@PathParam("country") String country){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", country))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", country)))
                .build();
        
    }
    
    @GET
    @Path("/v2/country/{country}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getByCountryV2(@PathParam("country") String country){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", country))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", country))
                        .add(Json.createObjectBuilder().add("id", "3").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", country))
                        .add(Json.createObjectBuilder().add("id", "4").add("beer-name", "Punk IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", country)))
                .build();
        
    }
    
    @GET
    @Path("/v1/search/{searchstr}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject searchV1(@PathParam("searchstr") String searchStr){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", searchStr + " Super IPA").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", searchStr + " IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", "UK")))
                .build();
        
    }
    
    @GET
    @Path("/v2/search/{searchstr}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject searchV2(@PathParam("searchstr") String searchStr){
        
        return Json.createObjectBuilder()
                .add("timestamp", new Date().toString())
                .add("ipas", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("id", "1").add("beer-name", searchStr + " Super IPA").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "2").add("beer-name", searchStr + " Magic IPA").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "3").add("beer-name", searchStr + " Awesome IPA").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"))
                        .add(Json.createObjectBuilder().add("id", "4").add("beer-name", searchStr + " IPA").add("brewery", "Brewdog").add("type", "Maerzen").add("alcohol", "5.6% ABV").add("user-rating", "4.00").add("country", "UK")))
                .build();
        
    }
    
    @POST
    @Path("/v1/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject newIpaV1(JsonObject ipa){
        
        if(ipa != null){
            System.out.println("received: " + ipa.toString());
        }
        
        int id = (int)(Math.random()*100);
        
        ipa = enrich(ipa, "id", String.valueOf(id));
        ipa = enrich(ipa, "version", "1.0");
        ipa = enrich(ipa, "timestamp", new Date().toString());
        
        return ipa;
    }
    
    @POST
    @Path("/v2/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject newIpaV2(JsonObject ipa){
        
        if(ipa != null){
            System.out.println("received: " + ipa.toString());
        }
        
        int id = (int)(Math.random()*100);
        
        ipa = enrich(ipa, "id", String.valueOf(id));
        ipa = enrich(ipa, "version", "2.0");
        ipa = enrich(ipa, "timestamp", new Date().toString());
        
        return ipa;
    }
    
    private JsonObject enrich(JsonObject source, String key, String value) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add(key, value);
        source.entrySet().
                forEach(e -> builder.add(e.getKey(), e.getValue()));
        return builder.build();
    }

}
