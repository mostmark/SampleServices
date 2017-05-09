package com.test;


public class Ipa {
    
    //"id", "1").add("beer-name", "Zipfer").add("brewery", "Brauerei Zipf").add("type", "Maerzen").add("alcohol", "5.0% ABV").add("user-rating", "5.00").add("country", "AT"
    
    private Integer id;
    private String beer_name;
    private String brewery;
    private String type;
    private String alcohol;
    private String userRating;
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeerName() {
        return beer_name;
    }

    public void setBeerName(String beerName) {
        this.beer_name = beerName;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    

}
